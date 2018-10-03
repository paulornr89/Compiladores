/**
 * @author - Paulo Roberto/Yuri
 */


import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
        LerArquivo prog1 = new LerArquivo();
        ArrayList<ArrayList<String>> listaTokens = new ArrayList<ArrayList<String>>();
        Pilha pilha = new Pilha();
        int op1,op2 = 0;

        prog1.leituraDeArquivo();

        listaTokens = prog1.getListaTokens();
        for(int i=0;i<listaTokens.size();i++){
            if(listaTokens.get(i).get(0).compareToIgnoreCase("PUSH")==0){
                pilha.push(listaTokens.get(i).get(1));
            }
            if(listaTokens.get(i).get(0).compareToIgnoreCase("ADD")==0){
                pilha.push(Integer.toString(pilha.pop()+pilha.pop()));
            }
            if(listaTokens.get(i).get(0).compareToIgnoreCase("SUB")==0){
                pilha.push(Integer.toString(-pilha.pop()+pilha.pop()));
            }
            if(listaTokens.get(i).get(0).compareToIgnoreCase("MULT")==0){
                pilha.push(Integer.toString(pilha.pop()*pilha.pop()));
            }
            if(listaTokens.get(i).get(0).compareToIgnoreCase("DIV")==0){
                op1=pilha.pop();
                op2=pilha.pop();
                pilha.push(Integer.toString(op2/op1));
            }
            if(listaTokens.get(i).get(0).compareToIgnoreCase("PRINT")==0){
                System.out.println(pilha.pop());
            }
        }

    }
}