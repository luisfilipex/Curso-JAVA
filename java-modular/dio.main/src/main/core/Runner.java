package main.core;

import utils.operacao.Calculadora;

import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sub(4,1));
    }
}
