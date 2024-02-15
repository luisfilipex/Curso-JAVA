package one.digitalinovation;

public class Main {

    public static void main(String args[]){
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No());
        minhaPilha.push(new No());
        minhaPilha.push(new No());
        minhaPilha.push(new No());
        minhaPilha.push(new No());
        minhaPilha.push(new No());

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);

        minhaPilha.push(new No());
        System.out.println(minhaPilha);
    }

}