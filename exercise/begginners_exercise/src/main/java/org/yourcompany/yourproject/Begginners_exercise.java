/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabiohrfilho
 */

public class Begginners_exercise {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // firstExercise();
        // secondExercise();
        // thirdExercise();
        // fourthExercise();
        // fifthExercise();
        sixthExercise();
    }

    /**
     * 
     * @brief This function calculates the sum of two integers.
     * 
     * @details The user is asked to input two integers. The function then
     *          calculates
     *          their sum and prints the result.
     * 
     */
    public static void firstExercise() {
        int firstNumber, secondNumber, result;
        try (Scanner sc = new Scanner(System.in)) {
            firstNumber = sc.nextInt();
            secondNumber = sc.nextInt();
            result = firstNumber + secondNumber;
            System.out.printf("SOMA = " + result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * 
     * @brief This function calculates the area of a circle given its radius.
     * 
     * @details The user is asked to inform the radius of the circle. After that,
     *          the area of the circle is calculated and printed.
     * 
     */

    public static void secondExercise() {
        double radius, result;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("digite o raio do circulo para saber a área do mesmo: ");
            radius = sc.nextDouble();
            result = PI * Math.pow(radius, 2);
            System.out.printf("A=%.4f%n", result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * 
     * @brief This function makes the difference between the product of A and B with
     *        the product of C and D.
     * 
     * @details The user is asked to inform the values of A, B, C and D. After that,
     *          the difference between the product of A and B with the product of C
     *          and D is calculated and printed.
     * 
     */
    public static void thirdExercise() {
        int a, b, c, d, result;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor de A: ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o valor de B: ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o valor de C: ");
            c = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o valor de D: ");
            d = sc.nextInt();
            sc.nextLine();
            result = (a * b) - (c * d);
            System.out.println("DIFERENCA = " + result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /**
     * 
     * @brief This function calculates the salary of an employee given their
     *        number, hourly salary and hours worked.
     * 
     * @details The user is asked to inform the number of the employee, the hourly
     *          salary and the hours worked. After that, the salary is calculated
     *          and the result is printed.
     * 
     */
    public static void fourthExercise() {
        int employeeNumber;
        double hoursWorked, hourlySalary, result;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o numero do funcionario: ");
            employeeNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Valor por hora do funcionário: ");
            hourlySalary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Valor de horas trabalhadas: ");
            hoursWorked = sc.nextDouble();
            sc.nextLine();
            result = hoursWorked * hourlySalary;
            System.out.println("NUMBER = " + employeeNumber);
            System.out.printf("SALARY = U$ %.2f%n", result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void fifthExercise() {
        int piecesQuantity;
        double pieceValue, firstPackResult, secondPackResult;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o codigo da peça: ");
            sc.nextLine();
            System.out.print("Digite o numero de peças: ");
            piecesQuantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o numero de peças: ");
            pieceValue = sc.nextDouble();
            sc.nextLine();
            firstPackResult = piecesQuantity * pieceValue;
            System.out.print("Digite o codigo da peça: ");
            sc.nextLine();
            System.out.print("Digite o numero de peças: ");
            piecesQuantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o numero de peças: ");
            pieceValue = sc.nextDouble();
            sc.nextLine();
            secondPackResult = piecesQuantity * pieceValue;
            System.out.printf("VALOR A PAGAR: R$ %.2f%n", firstPackResult + secondPackResult);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void sixthExercise() {
        double A, B, C, triangle, circle, square, trapeze, rectangle;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();

            triangle = (A * C) / 2.0;
            circle = PI * Math.pow(C, 2);
            trapeze = (A + B) * C / 2.0;
            square = Math.pow(B, 2);
            rectangle = A * B;

            System.out.printf("TRIANGULO: %.3f%n", triangle);
            System.out.printf("CIRCULO: %.3f%n", circle);
            System.out.printf("TRAPEZIO: %.3f%n", trapeze);
            System.out.printf("QUADRADO: %.3f%n", square);
            System.out.printf("RETANGULO: %.3f%n", rectangle);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
