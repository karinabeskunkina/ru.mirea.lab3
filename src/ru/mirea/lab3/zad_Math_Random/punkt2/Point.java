package ru.mirea.lab3.zad_Math_Random.punkt2;

public  class Point {
    double x;
    double y;
    public Point(){
            x = 0;
            y = 0;
    }
    public Point (double x, double y){
            this.x = x;
            this.y = y;
    }
    public double getX(){return x;}

    public void setX(double x){ this.x = x;}

    public double getY(){return y;}

    public void setY(double y){ this.y = y;}

}
