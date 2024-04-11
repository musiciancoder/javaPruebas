package mystreams.interfazfuncional;

import mystreams.interfazfuncionaldos.OperacionDos;

public class FuncInterApp { //notar que para q una Functional Interface funcione no se implementa nada

    public double operar(double x, double y){
        Operacion op = (n1,n2) ->n1+n2; //La interfaz funcional debe ser expresada como funcion lambda. notar que se instancia la interfaz. en vez de n1+n2 se podria escribir tambien Double::sum
        return op.calcular(x,y);
    }

    public double operarDos(double x, double y){
        OperacionDos opDos= (n1,n2) ->n1-n2;
        return opDos.calcularDos(x,y);
    }


    public static void main(String[] args) {
        FuncInterApp app = new FuncInterApp();
        double rpta = app.operar(2,3);
        double rptaDos = app.operarDos(2,3);

        System.out.println(rpta);
        System.out.println(rptaDos);
    }
}
