package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.modelo = "importado";
        carro1.nome = "lamborguini";
        carro1.ano = 1963;

        carro2.modelo = "GT 500";
        carro2.nome = "Mustang";
        carro2.ano = 1968;

         carro1 = carro2;

        System.out.println("\nCarro 1 ");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
