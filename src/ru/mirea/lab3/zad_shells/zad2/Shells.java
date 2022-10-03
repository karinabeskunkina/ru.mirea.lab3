package ru.mirea.lab3.zad_shells.zad2;

import java.util.Collections;

import static java.util.Objects.isNull;

public class Shells {
    public static void main(String[] args) {
        String[][] Array= new String[13][10];
        Array[0][1] = "Boolean";Array[0][2] = "Byte";Array[0][3] = "Character";Array[0][4] = "Double";Array[0][9] = "isStatic";
        Array[0][5] = "Float";Array[0][6] = "Integer";Array[0][7] = "Long";Array[0][8] = "Short";
        Array[1][0] = "byteValue"; Array[4][0] = "intValue"; Array[7][0] = "parseXxx"; Array[10][0] = "toString";
        Array[2][0] = "doubleValue"; Array[5][0] = "longValue"; Array[8][0] = "parseXxx with radix"; Array[11][0] = "toString(primitive)";
        Array[3][0] = "floatValue"; Array[6][0] = "shortValue";Array[9][0] = "valueOf with radix";Array[12][0] = "toString(primitive,radix)";
        String[][] Bo ={
                {"bbb", ""},
                {"Boolean", "parseXxx", "toString", "toString(primitive)"},
        {"Byte", "byteValue", "toString", "toString(primitive)", "valueOf with radix", "doubleValue", "doubleValue", "floatValue", "intValue", "longValue", "shortValue"},
        {"Character", "toString", "toString(primitive)"},
        {"Double", "toString", "toString(primitive)", "byteValue", "doubleValue", "floatValue", "longValue", "parseXxx", "shortValue"},
        {"Float", "toString", "toString(primitive)", "byteValue", "doubleValue", "floatValue", "longValue", "parseXxx", "intValue"},
        {"Integer", "toString", "toString(primitive)", "toString(primitive,radix)", "byteValue", "doubleValue", "floatValue", "longValue", "parseXxx", "intValue", "parseXxx with radix", "shortValue", "valueOf with radix"},
        {"Long", "toString", "toString(primitive)", "toString(primitive,radix)", "byteValue", "doubleValue", "floatValue", "longValue", "parseXxx", "intValue", "parseXxx with radix", "shortValue", "valueOf with radix"},
        {"Short", "toString", "toString(primitive)", "byteValue", "doubleValue", "floatValue", "longValue", "parseXxx", "intValue", "parseXxx with radix", "shortValue", "valueOf with radix"},
        {"isStatic", "toString"}
        };
        Array[0][0] = "";
        for(int i = 0; i < 10; ++i){
            if(Array[0][i].equals(Bo[i][0])){
                for(int j = 0; j < Bo[i].length; j++) {
                    for (int k = 0; k < 13; ++k) {
                        if(Array[k][0].equals(Bo[i][j])){
                            Array[k][i] = "*";
                        }
                    }
                }
            }
        }
        Array[0][0] = ".";
        for(int i = 0; i < 117;++i) {
            System.out.print("_");
        }
        System.out.println();
        for(int i = 0; i < 10;++i) {
            if(i == 0) {
                System.out.format("|%25s", Array[0][i]);
            }
            else{
                System.out.format("|%9s", Array[0][i]);
            }
        }
        System.out.println("|");
        for(int k = 0; k < 117;++k) {
            System.out.print("_");
        }
        System.out.println();
        for(int i = 1; i < 13; ++i){
            for(int j = 0; j < 10; ++j){
                if(j != 0 && Array[i][j] != "*"){
                    Array[i][j] = "";
                }
                if(j == 0) {
                    System.out.format("|%25s", Array[i][j]);
                }
                else{
                    System.out.format("|%9s", Array[i][j]);
                }
            }
            System.out.println("|");
        }
        for(int k = 0; k < 117;++k) {
            System.out.print("_");
        }
    }
}
