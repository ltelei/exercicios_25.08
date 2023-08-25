package proj_boletim;

import java.util.Scanner;

public class Proj_boletim {

    public static void main(String[] args) 
    //Sistema de boletim, criado por Lucas Abreu Leite

    {
        Scanner teclado = new Scanner(System.in);
        int nota1, nota2, nota3;
        float media;
        String nome;

        System.out.println("Digite seu nome");
        nome = teclado.nextLine();

        System.out.println("Bem vindo " + nome);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Digite a primeira nota");
        nota1 = teclado.nextInt();
        System.out.println("Digite a segunda nota");
        nota2 = teclado.nextInt();
        System.out.println("Digite a terceira nota");
        nota3 = teclado.nextInt();
        media = (nota1+nota2+nota3)/3;
        
        if(media>=7){
           System.out.println(nome+" Você foi aprovado ");
        } else if (media<7 && media >4 )               
        {
           System.out.println(nome + " Voce ficou de exame");
        } else if (media<4){
            System.out.println(nome = " Voce foi reprovado");
        }
                
    }

}
