import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author - Paulo Roberto/Yuri
 */
public class LerArquivo {
    private ArrayList<String> programa;
    private ArrayList<ArrayList<String>> listaTokens;
    private int cont;

    public LerArquivo(){
        this.programa = new ArrayList<String>();
        this.listaTokens = new ArrayList<ArrayList<String>>();
        this.cont = 0;
    }

    public void leituraDeArquivo(){
        try{
            FileReader arquivo = new FileReader("C:\\Users\\cpte.Paulo\\IdeaProjects\\Maquina de Pilha\\teste.txt");
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            int i = 0;
            this.programa.add(lerArquivo.readLine());
            while(this.programa.get(i)!= null){
                i++;
                this.programa.add(lerArquivo.readLine());
            }
            this.programa.remove(i);
        }catch(IOException e){
            System.err.printf("Erro ao abrir arquivo!", e.getMessage());
        }
    }

    public void quebraProgramaEmTokens(String S){
        String[] Tokens = S.split("\\s");
        this.listaTokens.add(new ArrayList<String>());
        for(int i=0;i<Tokens.length;i++) {
            this.listaTokens.get(this.cont).add(Tokens[i]);
        }
        this.cont++;
    }

    public void mostraPrograma(){
        for(int c = 0;c<this.programa.size();c++){
            System.out.println(this.programa.get(c));
        }
    }

    public ArrayList<ArrayList<String>> getListaTokens() {
        for(int i=0;i<this.programa.size();i++) {
            this.quebraProgramaEmTokens(this.programa.get(i));
        }
        return listaTokens;
    }
}
