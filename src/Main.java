import dominio.Animal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        int resposta = 1;
        while(true){
            System.out.println("1. Cadastrar um novo pet\n" +
                    "2. Alterar os dados do pet cadastrado\n" +
                    "3. Deletar um pet cadastrado\n" +
                    "4. Listar todos os pets cadastrados\n" +
                    "5. Listar pets por algum critério (idade, nome, raça)\n" +
                    "6. Sair");
            System.out.print("-----------------------------------\nResposta: ");
            try {
                resposta = in.nextInt();
                System.out.println("-----------------------------------");
            } catch (Exception e) {
                System.out.println("=================================\nValor inválido\n=================================");
                in.nextLine();
            }
            if (resposta == 6){
                break;
            } else if(resposta < 1 || resposta > 5) {
                continue;
            }
        }
        System.out.print("=== ENCERRANDO PROGRAMA ===");
        in.close();

    }
}
