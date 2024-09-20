package org.example;
import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Insira um número: ");
        int numero = sc.nextInt();

        FizzBuzz fizzBuzz = new FizzBuzz(numero);
        fizzBuzz.divisivelPor3e5();
    }
}
