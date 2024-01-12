package org.example;

import entity.Pets;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PetsDao {

    public Pets findById(int id){
        return HibernateSessionFactory.getSessionFactory().openSession().get(Pets.class, id);
    }

    public void create (Pets pet){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(pet);
        t.commit();
        session.close();
    }

    public void update (Pets pet){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(pet);
        t.commit();
        session.close();
    }

    public void delete (Pets pet){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(pet);
        t.commit();
        session.close();
    }

    public List<Pets> findAll(){
        List<Pets> pets = (List<Pets>) HibernateSessionFactory.getSessionFactory()
                                        .openSession().createQuery("From Pets").list();
        return pets;
    }
}
