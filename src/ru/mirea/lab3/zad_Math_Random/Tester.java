package ru.mirea.lab3.zad_Math_Random;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner seurse = new Scanner(System.in);
        int n = seurse.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            array[i] =Math.random();
            array[i] = rand.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(array[i] > array[j]){
                    double f = array[i];
                    array[i] = array[j];
                    array[j] = f;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
