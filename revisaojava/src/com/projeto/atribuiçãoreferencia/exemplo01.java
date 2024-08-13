package com.projeto.atribuiçãoreferencia;

public class exemplo01 {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("Int A = " +intA + " Int B = " + intB);
        intA =  2;
        System.out.println("Int A = " +intA + " Int B = " + intB);

        ex01 objA =  new ex01(1);
        ex01 objB = objA;
        System.out.println("ObjA objB = " + objA + " ObjA objB = " + objB);
        objA.setNum(2);
    }
}
