package mystreams.interfazfuncionaltres;

import mystreams.interfazfuncional.Operacion;

public class FuncInterApp implements OperacionTres {

    public double operar(double x, double y){
        OperacionTres op = (n1, n2) ->n1+n2; //notar que para ocupar OperacionTres (metodo abstracto) no estamos obligados a implementar OperacionTres...
        return op.calcular(x,y);
    }

    //...pero para hacer uso de los metodos no abstractos (los q llevan default), si debemos implementar OperacionTres
    @Override
    public double calcular(double n1, double n2) {
        return 0;
    }

    @Override
    public double calcularTres(double n1, double n2) {
        return OperacionTres.super.calcularTres(n1, n2);
    }

    @Override
    public double calcularCuatro(double n1, double n2) {
        return OperacionTres.super.calcularCuatro(n1, n2);
    }


    public static void main(String[] args) {
        mystreams.interfazfuncional.FuncInterApp app = new mystreams.interfazfuncional.FuncInterApp();
        double rpta = app.operar(2,3);
        double rptaDos = app.operarDos(2,3);

        System.out.println(rpta);
        System.out.println(rptaDos);
    }



}
