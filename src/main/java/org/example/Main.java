package org.example;

import entity.Pets;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Выберите действие с БД Pets \n" +
                          "1 - создать поле\n" +
                          "2 - вывести поле\n" +
                          "3 - вывести БД\n" +
                          "4 - обновить поле\n" +
                          "5 - удалить поле\n" +
                          "0 - выйти\n");
        Scanner scanner = new Scanner(System.in);
        int k;
        do{
            k=scanner.nextInt();
            switch (k){
                case 0:
                    System.out.println("Выход из БД");
                    break;
                case 1:
                    System.out.println("Введите название животного");
                    String petKid = scanner.next();
                    System.out.println("Введите имя животного");
                    String petName = scanner.next();
                    System.out.println("Введите возраст животного");
                    int petAge = scanner.nextInt();
                    System.out.println("Введите цвет животного");
                    String petColor = scanner.next();
                    System.out.println("Введите хозяина животного");
                    String petOwner = scanner.next();
                    Pets pet1 = new Pets(petKid,petName,petAge,petColor,petOwner);
                    PetsDao petsDao1 = new PetsDao();
                    petsDao1.create(pet1);
                    System.out.println("Выберите следующее действие");
                    break;
                case 2:
                    System.out.println("Введите id животного");
                    int id = scanner.nextInt();
                    PetsDao petsDao2 = new PetsDao();
                    System.out.println(petsDao2.findById(id));
                    System.out.println("Выберите следующее действие");
                    break;
                case 3:
                    System.out.println("Вывод таблицы Pets");
                    PetsDao petsDao3 = new PetsDao();
                    List<Pets> pets = petsDao3.findAll();
                    for (Pets p: pets) {
                        System.out.println(p);
                    }
                    System.out.println("Выберите следующее действие");
                    break;
                case 4:
                    System.out.println("Введите id животного, которое Вы хотите обновить");
                    int idUpdate = scanner.nextInt();
                    PetsDao petsDao4 = new PetsDao();
                    Pets pet4 = petsDao4.findById(idUpdate);
                    petsDao4.update(pet4);
                    System.out.println("Обновите название животного");
                    pet4.setPetKid(scanner.next());
                    System.out.println("Обновите имя животного");
                    pet4.setPetName(scanner.next());
                    System.out.println("Обновите возраст животного");
                    pet4.setPetAge(scanner.nextInt());
                    System.out.println("Обновите цвет животного");
                    pet4.setPetColor(scanner.next());
                    System.out.println("Обновите хозяина животного");
                    pet4.setPetOwner(scanner.next());
                    petsDao4.update(pet4);
                    System.out.println("Выберите следующее действие");
                    break;
                case 5:
                    System.out.println("Введите id животного, которое Вы хотите удалить");
                    int idDelete = scanner.nextInt();
                    PetsDao petsDao5 = new PetsDao();
                    petsDao5.delete(petsDao5.findById(idDelete));
                    System.out.println("Выберите следующее действие");
                    break;
                default:
                    System.out.println("Введено некорректное число\n" +
                                        "Повторите ввод");

            }

        } while (k!=0);
        scanner.close();
    }
}