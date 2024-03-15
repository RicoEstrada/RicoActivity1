/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ricoactivity._1.pkg0;

import java.util.Scanner;
/**
 *
 * @author ACER NITRO 5
 */
public class Activityone {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter your Last Name: ");
        String lName = scn.nextLine();
        
        System.out.println("Enter your First Name; ");
        String fName = scn.nextLine();
        
        System.out.println("Enter your Middle Initial: ");
        String mName = scn.nextLine();
        
        System.out.println("Enter your Age: ");
        int age = scn.nextInt();
        
        System.out.println("Enter your Gender: ");
        String sex = scn.nextLine();
        
        System.out.println("Enter your Birthdate (MM/DD/YYYY): ");
        String birthdate = scn.nextLine();
        
        System.out.println("Last Name: " + lName);
        System.out.println("First Name: " + fName);
        System.out.println("Middle Intial: " + mName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + sex);
        System.out.println("Birthdate: " + birthdate);
    }
}
