package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //printAreaRound();
        //z5();
        //z6();
        //z7();
        //z11();
        //z21();
        //z22();
        //z23();
        z24();
    }
    public static void printAreaRound() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int pole = a*b;
        int obwod = (a+b)*2;

        System.out.println("Pole =  "+pole);
        System.out.println("Obwod = "+obwod);
    }
    public static void z5() {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int h = scanner.nextInt();

        double objetosc = ((1*(3.14*(r*r))*h)/3);
        double pole = 3.14*r*r;

        System.out.println("Objetosc = "+objetosc);
        System.out.println("Pole = "+pole);

    }
    public static void z6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int suma = a+b;
        int roznica = a-b;
        int iloczyn = a*b;
        int iloraz = a/b;

        System.out.println("Suma =  "+suma);
        System.out.println("roznica = "+roznica);
        System.out.println("Iloczyn = "+iloczyn);
        System.out.println("Iloraz = "+iloraz);
    }
    public static void z7() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int iloraz = a/b;
        int reszta = a%b;

        System.out.println("Iloraz =  "+iloraz);
        System.out.println("Reszta =  "+reszta);
    }
    public static void z11() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int objetosc = a*b*c;
        int pole = 2*(a*b+a*c+b*c);

        System.out.println("Objętość =  "+objetosc);
        System.out.println("Pole =  "+pole);
    }
    public static void z21() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int iloraz = a%b;
        if(iloraz > 0)
        {
            System.out.println("Licba lest nieparzysta");
        }
        else
        {
            System.out.println("Licba lest parzysta");
        }
    }
    public static void z22() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a < 0)
        {
            System.out.println("Liczba jest ujemna");
        }
        else if(a > 0)
        {
            System.out.println("Liczba jest dodatnia");
        }
        else
        {
            System.out.println("Liczba równa się zero");
        }
    }
    public static void z23() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a > b && b > c)
        {
            System.out.println(a+ " jest największą liczbą");
            System.out.println(c+ " jest najmniejszą liczbą");
        }
        else if(c > b && b > a)
        {
            System.out.println(c+ " jest największą liczbą");
            System.out.println(a+ " jest najmniejszą liczbą");
        }
        else if(b > c && c > a)
        {
            System.out.println(b+ " jest największą liczbą");
            System.out.println(a+ " jest najmniejszą liczbą");
        }
        else if(a > c && c > b)
        {
            System.out.println(a+ " jest największą liczbą");
            System.out.println(b+ " jest najmniejszą liczbą");
        }
        else if(b > a && a > c)
        {
            System.out.println(b+ " jest największą liczbą");
            System.out.println(c+ " jest najmniejszą liczbą");
        }
        else
        {
            System.out.println(c+ " jest największą liczbą");
            System.out.println(b+ " jest najmniejszą liczbą");
        }
    }
    public static void z24() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int max;
        int min;

        if(a>b && a>c && a>d && a>e)
        {
            max = a;
        }
        else if(b>a && b>c && b>d && b>e)
        {
            max = b;
        }
        else if(c>a && c>b && c>d && c>e)
        {
            max = c;
        }
        else if(d>a && d>b && d>c && d>e)
        {
            max = d;
        }
        else
        {
            max = e;
        }

        if(a<b && a<c && a<d && a<e)
        {
            min = a;
        }
        else if(b<a && b<c && b<d && b<e)
        {
            min = b;
        }
        else if(c<a && c<b && c<d && c<e)
        {
            min = c;
        }
        else if(d<a && d<b && d<c && d<e)
        {
            min = d;
        }
        else
        {
            min = e;
        }

        System.out.println(max + " jest największą liczbą");
        System.out.println(min + " jest najmniejszą liczbą");

    }
}