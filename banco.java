public class BancoTerminal {

  public static void main(String[] args) {

    // Primeira operação

    double saldo1 = 25.0;

    double valorSolicitado1 = 18.0;



    // Verifica se o saldo é suficiente para o saque

    if (saldo1 >= valorSolicitado1) {

      saldo1 -= valorSolicitado1;

      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo1);

    } else {

      System.out.println("Saldo insuficiente");

    }



    // Segunda operação

    double saldo2 = 15.0;

    double valorSolicitado2 = 22.0;



    // Verifica se o saldo é suficiente para o saque

    if (saldo2 >= valorSolicitado2) {

      saldo2 -= valorSolicitado2;

      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo2);

    } else {

      System.out.println("Saldo insuficiente");

    }

  }

}

