/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ricoactivity._1.pkg0;

/**
 *
 * @author ACER NITRO 5
 */
public class Activityfour {
    public static void main(String[] args) {
        int entranceScore = 75;
        double gpa = 3.5;

        if (entranceScore > 70) {
            if (gpa > 3.0) {
                System.out.println("The student is eligible for admission.");
            } else {
                System.out.println("The student is not eligible for admission due to low GPA.");
            }
        } else {
            System.out.println("The student is not eligible for admission due to low entrance score.");
        }
    }
}
