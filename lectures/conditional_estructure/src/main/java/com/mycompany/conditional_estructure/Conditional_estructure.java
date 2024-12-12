/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conditional_estructure;

import java.util.Scanner;

/**
 *
 * @author fabiohrfilho
 */
public class Conditional_estructure {
    public static void main(String[] args) {
        // firstExample();
        // secondExample();
        thirdExample();
    }

    /**
     * Prints "Bom dia", "Boa Tarde", and "Boa Noite" to the console,
     * depending on the value of x.
     */
    public static void firstExample() {
        System.out.println("Bom dia");
        int x = 0;
        if (x < 0) {
            System.out.println("Boa Tarde");
        }
        System.out.println("Boa Noite");
    }

    /**
     * 
     * @brief Prints "Bom dia!" or "Boa tarde!" to the console,
     *        depending on the value of the hour the user inputs.
     * 
     * @details The user is asked to input the hour of the day. If the
     *          hour is less than 12, "Bom dia!" is printed. Otherwise,
     *          "Boa tarde!" is printed.
     * 
     */
    public static void secondExample() {
        int hour;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Quantas horas?");
            hour = sc.nextInt();
            if (hour < 12) {
                System.out.println("Bom dia!");
            } else {
                System.out.println("Boa  tarde!");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * 
     * @brief Prints "Bom dia!", "Boa tarde!" or "Boa noite!" to the console,
     *        depending on the value of the hour the user inputs.
     * 
     * @details The user is asked to input the hour of the day. If the
     *          hour is less than 12, "Bom dia!" is printed. If the hour is
     *          between 12 and 18, "Boa tarde!" is printed. Otherwise,
     *          "Boa noite!" is printed.
     * 
     */
    public static void thirdExample() {
        int hour;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Quantas horas?");
            hour = sc.nextInt();
            if (hour < 12) {
                System.out.println("Bom dia!");
            } else if (hour >= 12 && hour < 18) {
                System.out.println("Boa tarde!");
            } else {
                System.out.println("Boa Noite!");
            }
            sc.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
