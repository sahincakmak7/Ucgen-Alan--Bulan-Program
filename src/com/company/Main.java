package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a,b,c,u;
        double area;
        int perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenarı giriniz :");
        a = input.nextInt();
        System.out.print("2.Kenarı giriniz :");
        b = input.nextInt();
        System.out.print("3.Kenarı giriniz :");
        c = input.nextInt();


        perimeter = (a+b+c);
        u = (perimeter/2);
        System.out.println("Üçgenin çevresi : " + perimeter);

        area =  Math.sqrt(u *((u-a)*(u-b)*(u-c)));
        System.out.println("Üçgenin alanı :"+area);


    }
}
