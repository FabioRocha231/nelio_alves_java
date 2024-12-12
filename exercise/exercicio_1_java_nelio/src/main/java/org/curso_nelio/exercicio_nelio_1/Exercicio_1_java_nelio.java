/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.curso_nelio.exercicio_nelio_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabiohrfilho
 */
public class Exercicio_1_java_nelio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // try (Scanner sc = new Scanner(System.in)) {
        // String x;
        // int y;
        // double z;
        // x = sc.next();
        // y = sc.nextInt();
        // z = sc.nextDouble();
        // System.out.println("Dados Digitados:");
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);
        // sc.close();
        // } catch (Exception e) {
        // System.err.println(e);
        // }

        try (Scanner sc = new Scanner(System.in)) {
            int x;
            String s1, s2, s3;
            x = sc.nextInt();
            sc.nextLine();
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("Dados digitados:");
            System.out.println(x);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
