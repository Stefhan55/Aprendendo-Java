package javacore.BintroducaoMetodos.Test;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(24,2);
        System.out.println(result);
        calculadora.imprimeDivisaoDeDoisNumeros(86,5);
    }
}
