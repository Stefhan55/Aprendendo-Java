package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "mestrekame";
        professor.idade = 300;
        professor.sexo = 'M';
        System.out.println(" nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
