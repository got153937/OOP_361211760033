package Lap7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBookApp {

    public static void main(String[] args) {

        List<NoteBook> myList = new ArrayList<NoteBook>();
        System.out.println(myList);//null
        myList = addNoteBook(myList);

        System.out.println(myList);

        myList = addNoteBook(myList);

        System.out.println(myList);



    }//main

    private static List<NoteBook> addNoteBook(List<NoteBook> myList) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        String brand = SC.nextLine();
        System.out.print("Enter Model: ");
        String model = SC.nextLine();
        System.out.print("Enter CPU: ");
        String cpu = SC.nextLine();
        System.out.print("Enter GPU: ");
        String gpu = SC.nextLine();
        System.out.print("Enter RAM: ");
        String ram = SC.nextLine();
        System.out.print("Enter Display: ");
        String display = SC.nextLine();
        System.out.print("Enter HDD: ");
        String hdd = SC.nextLine();
        System.out.print("Enter OS: ");
        String os = SC.nextLine();
        System.out.print("Enter Price: ");
        double price = SC.nextDouble();

        //create object
        NoteBook np = new NoteBook(brand, model, cpu, gpu, ram, display, hdd, os, price);
        //add object into List
        myList.add(np);

        return myList;







    }
}//class
