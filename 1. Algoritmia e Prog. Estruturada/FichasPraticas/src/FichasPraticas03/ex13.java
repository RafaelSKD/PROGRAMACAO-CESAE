package FichasPraticas03;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("- Introduza um numero de inicio:  ");
        num1 = input.nextInt();
        System.out.print("- Introduza um numero de fim:  ");
        num2 = input.nextInt();

        while (num1 % 5 != 0)
            num1++;
        while (num1 <= num2){
            System.out.println("- " + num1);
            num1 = num1 + 5;
        }
    }
}