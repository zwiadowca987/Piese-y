package com.company;

import java.util.Scanner;

class Dog {
    private String imie;
    private int wiek;
    private boolean szczepiony;
    private char pytanie;
    Scanner input = new Scanner(System.in);

    public Dog() {
        imie = "BRAK";
        wiek = 0;
        szczepiony = false;
        pytanie = 'n';
    }

    public Dog(String a, int b, boolean c) {
        imie = a;
        wiek = b;
        szczepiony = c;
    }

    public void pobierz() {
        System.out.print("Podaj imie swojego psa: ");
        imie = input.nextLine();
        System.out.print("Podaj jego wiek: ");
        wiek = input.nextInt();
        System.out.print("Czy był szczepiony? [t/n] ");
        pytanie = input.next().charAt(0);
        if(pytanie == 't') szczepiony = true;
    }

    public void wyswietl() {
        System.out.println("Twój pupil ma na imię: " + imie);
        System.out.println("Ma na " + wiek + " lat");
        if(szczepiony == false) System.out.println("Twój pies nie był szczepiony");
        else System.out.println("Twój pies był szczepiony");
    }

    public String toString() {
        if(szczepiony) return "Twój pies wabi się: " + imie + ", ma " + wiek + " lat i był szczepiony :))";
        else return "Twój pies wabi się: " + imie + ", ma " + wiek + " lat i nie był szczepiony :((";
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.wyswietl();
        Dog dog2 = new Dog("Pieseł", 1234567890, false);
        dog2.wyswietl();
        dog1.pobierz();
        System.out.println(dog1.toString());
        dog1.wyswietl();
        System.out.println("Wynik działania metody hashCode(): " + dog1.hashCode());
    }
}
