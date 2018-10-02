import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
        ArrayList<String> listaTokens = new ArrayList<String>();
        try{
            FileReader arquivo = new FileReader("teste.txt");
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            int i = 0;
            listaTokens.add(lerArquivo.readLine());
            while(listaTokens.get(i)!= null){
                i++;
                listaTokens.add(lerArquivo.readLine());
            }
            listaTokens.remove(i);
            for(int c = 0;c<listaTokens.size();c++){
                System.out.println(listaTokens.get(c));
            }
        }catch(IOException e){
            System.err.printf("Erro ao abrir arquivo!", e.getMessage());
        }
    }
}