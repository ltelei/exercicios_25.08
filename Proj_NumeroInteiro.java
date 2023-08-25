
package proj_numerointeiro;

import java.util.Scanner;

/**
 *
 * Lucas Abreu Leite Nepomuceno
 */
public class Proj_NumeroInteiro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1,n2;
       
        System.out.println(" Escreva um número ");
        n1 = teclado.nextInt();
        
        System.out.println(" Escreva outro numero ");
        n2 = teclado.nextInt();

        System.out.println("O resultado da soma é: " + (n1 + n2));
    }
    
}
