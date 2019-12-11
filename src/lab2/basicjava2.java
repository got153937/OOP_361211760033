package lab2;

import java.util.Scanner;

public class basicjava2 {

    public static void main(String[] args) {
        //input ชื่อ
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        System.out.println("Your name is "+name);
//
//
//        //input อีเมล์
//        System.out.print("Enter Your Email: ");
//        String email = sc.nextLine();
//        System.out.println("Your name is "+email);


        //input integer and floating
        System.out.print("Enter an number: ");
        int num = sc.nextInt();
        System.out.println("Your entered number: "+num);


        System.out.print("Enter a real number: ");
        double d = sc.nextDouble();
        System.out.println(d);


    }
}
