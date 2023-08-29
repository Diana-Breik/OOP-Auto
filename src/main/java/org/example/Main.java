package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Erstellt ein Objekt der Klasse 'Auto' und
        // ruft die Methode zum Starten auf.
        Auto auto1= new Auto();
        auto1.startTheCar();


        //Erstellt ein zweites Objekt der Klasse 'Auto',
        // beschleunigt es und gebt die Geschwindigkeit aus.
        Auto auto2= new Auto();
        System.out.println("Geben Sie bitte die neue Geschwindigkeitserhöhung ein, die Sie möchten!");
        int zusätzlichegeschindigkeit = scanner.nextInt();
        auto2.increaseSpeed(zusätzlichegeschindigkeit);
        System.out.println("Geben Sie bitte die neue Geschwindigkeitserhöhung ein, die Sie möchten!");
        zusätzlichegeschindigkeit = scanner.nextInt();
        auto2.increaseSpeed(zusätzlichegeschindigkeit);
        System.out.println(auto2.speed);
        auto2.decreasedSpeed(10);


    }
}
