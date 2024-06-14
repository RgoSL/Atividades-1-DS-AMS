/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bm, bm2, al, ar;
        System.out.println("Qual o valor da Maior Base? ");
        bm = input.nextDouble();
        System.out.println("Qual o valor da Menor base? ");
        bm2 = input.nextDouble();
        System.out.println("Qual a Altura do Trapézio? ");
        al = input.nextDouble();
        ar = ((bm + bm2)*al)/2;
        System.out.println("O valor da Área do Trapézio é: "+ar);
    }
    
}
