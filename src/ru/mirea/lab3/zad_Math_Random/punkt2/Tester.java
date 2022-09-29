package ru.mirea.lab3.zad_Math_Random.punkt2;

import java.util.Scanner;

public class Tester {
    public static String Min_p(Circle[] c){
        double m = 100000;
        Circle c_min = new Circle();
        for(Circle x: c){
            if(x.r < m){
                m = x.r;
                c_min = x;
            }
        }
        return c_min.toString();
    }

    public static String Max_p(Circle[] c){
        double m = -1;
        Circle c_max = new Circle();
        for(Circle x: c){
            if(x.r > m){
                m = x.r;
                c_max = x;
            }
        }
        return c_max.toString();
    }

    public static void Sort_p(Circle[] c){
        for(int i = 0; i < c.length; ++i){
            for(int j = i + 1; j < c.length; ++j) {
                if(c[i].r > c[j].r){
                    Circle x = c[i];
                    c[i] = c[j];
                    c[j] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        int n = 3;
        Circle[] c =new Circle[n];
        for(int i = 0; i < n; i++){
            Circle a = new Circle();
            a.x =  Math.random();
            a.y =  Math.random();
            a.r =  Math.random();
            c[i] = a;
        }

        System.out.println("Min Circle: " + Min_p(c));
        System.out.println("Max Circle: " + Max_p(c));
        Sort_p(c);
        for(Circle x: c){
            System.out.println(x.toString());
        }
/*
        for(Tester P: c){
            System.out.println("x: " + P.x + "\ty: " + P.y + "\tRadiuse: " + P.r);

        }

 */

    }
}
