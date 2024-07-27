package one.digitalinnovation;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args){

      Queue<Carro> queueCarros = new LinkedList<>();
      
      queueCarros.add(new Carro("Ford"));
      queueCarros.add(new Carro("Fiat"));
      queueCarros.add(new Carro("Chevrolet"));
      queueCarros.add(new Carro("Volvo"));
      
  
      System.out.println(queueCarros);
    
    
    }
} 