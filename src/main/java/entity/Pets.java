package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Pets {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "petKid", nullable = false, length = 15)
    private String petKid;
    @Basic
    @Column(name = "petName", nullable = false, length = 15)
    private String petName;
    @Basic
    @Column(name = "petAge", nullable = false)
    private int petAge;
    @Basic
    @Column(name = "petColor", nullable = false, length = 10)
    private String petColor;
    @Basic
    @Column(name = "petOwner", nullable = true, length = 20)
    private String petOwner;

    public Pets() {
    }

    public Pets(String petKid, String petName, int petAge, String petColor, String petOwner) {
        this.petKid = petKid;
        this.petName = petName;
        this.petAge = petAge;
        this.petColor = petColor;
        this.petOwner = petOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetKid() {
        return petKid;
    }

    public void setPetKid(String petKid) {
        this.petKid = petKid;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getPetColor() {
        return petColor;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", petKid='" + petKid + '\'' +
                ", petName='" + petName + '\'' +
                ", petAge=" + petAge +
                ", petColor='" + petColor + '\'' +
                ", petOwner='" + petOwner + '\'' +
                '}';
    }
}
