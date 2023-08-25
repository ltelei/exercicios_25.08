
package proj_estado_civil;

import java.util.Scanner;


public class Proj_Estado_civil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o estado civil (S - solteiro/ C - casado/ D - divorciado/V- viúvo): ");
        String estadoCivil = scanner.nextLine();
        
        if (estadoCivil.equals("S")) {
            System.out.println("Você é solteiro(a).");
        } else if (estadoCivil.equals("C")) {
            System.out.println("Você é casado(a).");
        } else if (estadoCivil.equals("D")) {
            System.out.println("Você é divorciado(a).");
        } else if (estadoCivil.equals("V")) {
            System.out.println("Você é viúvo(a).");
        } else {
            System.out.println("Estado civil não reconhecido.");
        }
        
        scanner.close();
    }
}






