
//code made by jek chong
// this code will make, remove, and list the tasks the user inputs
package com.killoran.week1;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int choice=0;

        List<String> tasks = new ArrayList<>();
while(choice != 5) {
    System.out.println("please chose an option:");
    System.out.println("(1)Add a task.");
    System.out.println("(2)Remove task.");
    System.out.println("(3)Update a task.");
    System.out.println("(4)List all task.");
    System.out.println("(5)Exit.");


   // tasks.add("Wash the clothes");
    Scanner input = new Scanner(System.in);
    choice = input.nextInt();


    if (choice == 1) {
        System.out.println("what do you want to add?");
        Scanner lol = new Scanner(System.in);
        String answer = lol.nextLine();

        tasks.add(answer);
        //System.out.println(tasks);
    }
    if (choice == 2) {
        System.out.println("what do you need to remove?");
        Scanner lol1 = new Scanner(System.in);
        String hola = lol1.nextLine();
        tasks.remove(hola);
    }
    if (choice == 3) {

    }
    if (choice == 4) {
        System.out.println(tasks);
    }

    if (choice == 5) {
        System.out.println("thank you");
        System.exit(0);
    }


}
    }
}
