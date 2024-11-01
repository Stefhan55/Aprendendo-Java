package javacore.BintroducaoMetodos.Test;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println("Finalizando CalculadoraTest1");
        calculadora.subtraDoisNumeros();
        System.out.println("Finalizando CalculadoraTest1");

    }
}
