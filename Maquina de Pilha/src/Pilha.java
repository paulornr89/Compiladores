import java.util.ArrayList;

public class Pilha {
    private ArrayList<String> stack;

    public Pilha(){
        this.stack = new ArrayList<String>();
    }

    public void push(String S){
        this.stack.add(S);
    }

    public int pop(){
        String num = this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return Integer.parseInt(num);
    }

    public void imprimePilha(){
        if(this.stack.size()!=0) {
            for (int i = 0; i < this.stack.size(); i++) {
                System.out.println(this.stack.get(i));
            }
        }
        else{
            System.out.println("Pilha Vazia");
        }
    }
}


