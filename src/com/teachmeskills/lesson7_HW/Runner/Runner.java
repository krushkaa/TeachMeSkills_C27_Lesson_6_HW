package com.teachmeskills.lesson7_HW.Runner;

import com.teachmeskills.lesson7_HW.Card.CreditCard;
import com.teachmeskills.lesson7_HW.Student.Student;

public class Runner {
    public static void main(String[] args) {
        // Task1
        CreditCard card1 = new CreditCard("AA123AA", 123.00);
        CreditCard card2 = new CreditCard("BB456BB", 456.50);
        CreditCard card3 = new CreditCard("CC789CC", 789.99);

        card1.chargeAmount(77);
        card2.chargeAmount(43.50);
        card3.withdrawAmount(289.99);

        card1.checkCardInfo();
        card2.checkCardInfo();
        card3.checkCardInfo();

        // Task2
        System.out.println();
        System.out.println("Task2");
        Student st1 = new Student("Олег", "Манеев", "MP7775533", "C27-onl");
        Student st2 = new Student("Артём", "Астапчик", "MP7775533", "C27-onl");
        Student st3 = new Student("Анастасия", "Иргалиева", "MP7775533", "C27-onl");
        Student st4 = new Student("Артем", "Каральчук", "MP7775533", "C27-onl");
        Student st5 = new Student("Никита", "Крайко", "MP7775533", "C27-onl");
        Student st6 = new Student("Иван", "Михновецкий ", "MP7775533", "C27-onl");
        Student st7 = new Student("Кирилл", "Паляница", "MP7775533", "C27-onl");
        Student st8 = new Student("Руслан", "Рябухин", "MP7775533", "C27-onl");
        Student st9 = new Student("Евгений", "Саркисов", "MP7775533", "C27-onl");
        Student st10 = new Student("Павел", "Свинко", "MP7775533", "C27-onl");
        Student st11 = new Student("Руслан", "Семенчик", "MP7775533", "C27-onl");
        Student st12 = new Student("Руслан", "Третяк", "MP7775533", "C27-onl");
        Student st13 = new Student("Александр", "Хамицкий", "MP7775533", "C27-onl");
        Student st14 = new Student("Даниил", "Чаботько", "MP7775533", "C27-onl");
        Student st15 = new Student("Алексей", "Шубин", "MP7775533", "C27-onl");
        Student st16 = new Student("Владислав", "Колос", "MP7775533", "C27-onl");

        Student[] arr = new Student[]{st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16};

        for (Student student : arr) {
            System.out.println(student.name + " " + student.surname + ", " + student.passportNumber + ", " + student.groupNumber + ";");
        }
    }
}
