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
        //z24();
        //z25();
        //z26();
        z27();
        //z28();
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
    public static void z25() {
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();

        if(rok % 400 == 0 || rok % 4 == 0)
        {
            System.out.println(rok + " rok jest przestępny");
        }
        else
        {
            System.out.println(rok + " rok jest nieprzestępny");
        }
    }
    public static void z26() {
        Scanner scanner = new Scanner(System.in);
        int miesiac = scanner.nextInt();

        switch(miesiac) {
            case 1:
                System.out.println(miesiac + " miesiąc to jest Styczeń");
                break;
            case 2:
                System.out.println(miesiac + " miesiąc to jest Luty");
                break;
            case 3:
                System.out.println(miesiac + " miesiąc to jest Marzec");
                break;
            case 4:
                System.out.println(miesiac + " miesiąc to jest Kwiecień");
                break;
            case 5:
                System.out.println(miesiac + " miesiąc to jest Maj");
                break;
            case 6:
                System.out.println(miesiac + " miesiąc to jest Czerwiec");
                break;
            case 7:
                System.out.println(miesiac + " miesiąc to jest Lipiec");
                break;
            case 8:
                System.out.println(miesiac + " miesiąc to jest Sierpień");
                break;
            case 9:
                System.out.println(miesiac + " miesiąc to jest Wrzesień");
                break;
            case 10:
                System.out.println(miesiac + " miesiąc to jest Październik");
                break;
            case 11:
                System.out.println(miesiac + " miesiąc to jest Listopad");
                break;
            case 12:
                System.out.println(miesiac + " miesiąc to jest Grudzień");
                break;
            default:
                System.out.println("Od 1 do 12");
        }
    }
    public static void z28() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a+b > c && a+c > b && b+c > a)
        {
            System.out.println("Można zbudować trójkąt");
        }
        else
        {
            System.out.println("Nie można zbudować trójkąt");
        }
    }
    public static void z27(){
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        String romanDigit = "";
        if (number < 0 || number > 3999) {
            System.out.println( "Numer od 0 do 3999");
        }
        else
        {
            System.out.print(number + " = " + romanDigit);
            System.out.print(convert(number));
        }
    }
    public static String romanDigit(int n, String one, String five, String ten){

        if(n >= 1)
        {
            if(n == 1)
            {
                return one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n==4)
            {
                return one + five;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 9)
            {
                return one + ten;
            }

        }
        return "";
    }
    public static String convert(int number){

        String romanOnes = romanDigit( number%10, "I", "V", "X");
        number /=10;
        String romanTens = romanDigit( number%10, "X", "L", "C");
        number /=10;
        String romanHundreds = romanDigit(number%10, "C", "D", "M");
        number /=10;
        String romanThousands = romanDigit(number%10, "M", "", "");

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;
    }

}