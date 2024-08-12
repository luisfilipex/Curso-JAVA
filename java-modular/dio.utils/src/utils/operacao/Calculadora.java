package utils.operacao;

import utils.operacao.internal.DivHelper;
import utils.operacao.internal.MultHelper;
import utils.operacao.internal.SubHelper;
import utils.operacao.internal.SumHelper;

public class Calculadora {
    private DivHelper divHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
    }

    public int sum (int a, int b){
        return sumHelper.execute(a,b);
    }
    public int sub (int a, int b){
        return subHelper.execute(a,b);
    }
    public int mult (int a, int b){
        return multHelper.execute(a,b);
    }
    public int div (int a, int b){
        return divHelper.execute(a,b);
    }
}
