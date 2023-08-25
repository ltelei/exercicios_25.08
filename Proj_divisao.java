package proj_divisao;

import java.util.Scanner;

/**
 *
 * @author lucas_a_nepomuceno
 */
public class Proj_divisao {

    public static void main(String[] args) {
        // Criado por Lucas Abreu Leite
        Scanner teclado = new Scanner(System.in);
        float num1, num2, result;

        System.out.println("Digite um numero");
        num1 = teclado.nextFloat();

        System.out.println("Digite o segundo numero");
        num2 = teclado.nextFloat();
        
        if (num2==0 || num1 == 0){
            System.out.println("Impossivel dividir por 0");
        } else {
            result = num1 / num2;{
            System.out.println("O resultado é "+ result);
            teclado.close(); 
        }
            
        

        
    }

}
}