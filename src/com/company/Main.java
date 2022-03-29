package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a,b,c;
        double area;
        int perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenarı giriniz :");
        a = input.nextInt();
        System.out.print("2.Kenarı giriniz :");
        b = input.nextInt();
        System.out.print("3.Kenarı giriniz :");
        c = input.nextInt();


        perimeter = ((a+b+c));
        System.out.println("Üçgenin çevresi : " + perimeter);

        area =  Math.sqrt(perimeter *(perimeter-a)*(perimeter-b)*(perimeter-c));
        System.out.println("Üçgenin alanı :"+area);


    }
}
