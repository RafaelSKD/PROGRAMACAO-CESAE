package FichasPraticas05;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int i = 0;
        int[] vetor = new int[10];

        while (i <= 9){
            System.out.print("> Insira um número no Array[" + i +"]:");
            vetor[i] = input.nextInt();
            i++;
        }
        i = 0;
        while (i <= 9){
            System.out.println("> " + vetor[i]);
            i++;
        }
    }
}
