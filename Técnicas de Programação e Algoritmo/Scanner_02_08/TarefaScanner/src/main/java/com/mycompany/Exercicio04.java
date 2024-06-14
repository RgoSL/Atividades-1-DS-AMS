/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double D, Al, OB;
        System.out.println("Qual a Altura em metros dos Degraus? ");
        D = input.nextDouble();
        System.out.println("Qual Altura em metros você deseja alcançar? ");
        Al =input.nextDouble();
        OB = Al *D;
        System.out.println("Você deverá subir "+OB+" Degraus para chegar a Altura desejada ");
    }
    
}
