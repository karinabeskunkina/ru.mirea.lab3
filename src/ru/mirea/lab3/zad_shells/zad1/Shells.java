package ru.mirea.lab3.zad_shells.zad1;

public class Shells {
    public static void main(String[] args) {
        Double x = new Double(5);
        Double y = x.valueOf("3");
        String s = "55";
        Double a = Double.parseDouble(s);
        System.out.println(y);
        System.out.println(a);
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
