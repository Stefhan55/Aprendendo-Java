/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1prog2;
import javax.swing.JOptionPane;
public class Aula1prog2 {

   
    public static void main(String[] args) {
        
        String idade = JOptionPane.showInputDialog("Digite sua Idade");
        
        try {
            int idadeNumero = Integer.parseInt(idade);
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null," A idade digitada deve ser numerica");
        }finally{
             JOptionPane.showMessageDialog(null,"Programa Finalizado");
        }
        
    }
    
}
