import java.util.ArrayList;

public class Pilha {
    private ArrayList<String> stack;

    public Pilha(){
        this.stack = null;
    }
    public void push(String S){
        this.stack.add(S);
    }
    public void pop(){
        this.stack.get(this.stack.size()-1);
    }
    public void imprimePilha(){
        for(int i=0;i<this.stack.size();i++){
            System.out.println(this.stack.get(i));
        }
    }
}


