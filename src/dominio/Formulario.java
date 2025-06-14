package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Formulario {
    static ArrayList<String> perguntas;

    public static void lerPeguntas(){
        try (FileReader fr = new FileReader("C:\\desafioCadastro\\formulario.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null){
                Formulario.perguntas.add(linha);
            }

        } catch (IOException e){

        }
    }



    public static String mostrarPerguntas(){
        StringBuilder sb = new StringBuilder();
        sb.append();
        return "";
    }

}
