package com.teachmeskills.lesson7_HW.Card;

import java.util.Scanner;

public class CreditCard {

    public String accountNumber;
    public double amountInTheAccount;

    public CreditCard(String accountNumber, double amountInTheAccount) {
        this.accountNumber = accountNumber;
        this.amountInTheAccount = amountInTheAccount;
    }

    public void chargeAmount(double charge) {
        System.out.println("Добро пожаловать!");
        System.out.println("Остаток на счёте: " + this.amountInTheAccount);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму, которую хотите положить на счёт: ");
        double chargeAmount = scanner.nextDouble();
        this.amountInTheAccount += chargeAmount;
        System.out.println("Остаток на счёте: " + this.amountInTheAccount);
        System.out.println();
    }

    public void withdrawAmount(double withdraw) {
        System.out.println("Добро пожаловать!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Остаток на счёте: " + this.amountInTheAccount);
        System.out.print("Введите сумму, которую хотите снять со счёта: ");
        double withdrawAmount = scanner.nextDouble();
        if ((this.amountInTheAccount - withdrawAmount) < 0) {
            System.out.println("Недостаточно средств :(");
        } else {
            System.out.println("Остаток на счёте: " + (this.amountInTheAccount -= withdrawAmount));
        }
        System.out.println();
    }

    public void checkCardInfo() {
        System.out.println("Номер счёта: " + accountNumber + ". " + "Остаток на счёте: " + amountInTheAccount);
    }
}
