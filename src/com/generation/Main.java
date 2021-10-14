package com.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Estructura de control If
        /*if(condicion) {

        } else if {

        } else {

        }


        Scanner sc = new Scanner(System.in); //Esta línea crea un objeto scanner
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cuál es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();

        if(edad >= 18){
            System.out.println("Felicidades " + nombre + ", puedes votar");
        } else {
            System.out.println("Hola " + nombre + "Aún no puedes votar");
        }

        sc.close();
        */

        /* Solicitar al usuario 3 angulos de un triangulo y determinar si el triángulo es válido

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer ángulo");
        int ang1 = sc.nextInt();
        System.out.println("Ingresa el segundo ángulo");
        int ang2 = sc.nextInt();
        System.out.println("Ingresa el tercer ángulo");
        int ang3 = sc.nextInt();
        int triValido = ang1 + ang2 + ang3;
        if(triValido == 180){
            System.out.println("Tienes un triángulo válido");
        } else {
            System.out.println("Tienes un triángulo inválido");
        }
        sc.close();
        }
        */


        //Pedir un año al usuario por consola, y determinar si el año es bisiesto.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año");
        int año = sc.nextInt();
        if (año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else if (año % 100 == 0) {
            System.out.println("Lo siento. El año " + año + " no es bisiesto ");
        } else if (año % 4 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("Lo siento. El año " + año + " no es bisiesto ");
        }
    }
}



