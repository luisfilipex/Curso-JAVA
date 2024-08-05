package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facede.Facede;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        //stategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        /*Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();*/

        Facede facede = new Facede();
        facede.migrarCliente("Luis", "74265130");
    }
}
