package FichasExtra.Condicionais;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("- Introduza a idade:  ");
        idade = input.nextInt();

        if (idade >= 18)
            System.out.println("- Maior de idade.");
        else
            System.out.println("- Menor de idade.");
    }
}
