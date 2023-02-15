/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchescolha;

import java.util.Scanner;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class SwitchEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.print("Quantidade de pernas:");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (pernas){
                case 1:
                    tipo = "Saci";
                    break;
                case 2:
                    tipo = "bipede";
                    break;
                case 4:
                    tipo = "quadrupede";
                    break;
                case 6, 8:
                    tipo = "aracnideo";
                    break;
                default:
                    tipo = "ET";
        }
        System.out.println(tipo);
                    
        
        
    }
    
}
