package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvilken farve er din bil?:");
        String farve = scanner.nextLine();
        System.out.println("Hvilket mærke er din bil?:");
        String mærke = scanner.nextLine();
        System.out.println("Hvor mange hestekræfter har din bil?: ");
        int c = scanner.nextInt();
        if (c<200){
            System.out.println("Din " + farve + " " + mærke + " er langsom");}
        else System.out.println("Din " + farve + " " + mærke + " er hurtig");
        System.out.println("Venter på go:");
        String go = scanner.nextLine();
        int fart = (int) (Math.random()*200+50);
        System.out.println("Skal vi finde din topfart?");
        System.out.println("Din bil har en topfart på " + fart);
        System.out.println("Skriv go for at starte bilen");
        if (scanner.nextLine().equals("go")){

        System.out.println("Starter bilen...");
                for (int i = 0; i<=fart; i++)
            {
        System.out.println(i);}
            System.out.println("Skriv stop for at stoppe bilen");
        String stop = scanner.nextLine();
        if (stop.equals("stop")){
            for (int i = fart; i > 0 ; i--) {
                System.out.println(i);}
                System.out.println("Bilen er nu stillestående, god dag!");




        }
    }
}}
