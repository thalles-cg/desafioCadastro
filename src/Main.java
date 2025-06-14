import dominio.Animal;

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
            resposta = in.nextInt();
            if (resposta == 6){
                break;
            } else if(resposta < 1 || resposta > 5) {
                System.out.println("não mostrou");
                continue;
            }
            System.out.println("mostrou");
        }
        System.out.print("=== ENCERRANDO PROGRAMA ===");
        in.close();

    }
}
