package mystreams.interfazfuncional;

public class ClaseDePrueba {

    private String atr1;
    private String atr2;

    public ClaseDePrueba(String atr1, String atr2) {
        this.atr1 = atr1;
        this.atr2 = atr2;
    }

    public String getAtr1() {
        return atr1;
    }

    @Override
    public String toString() {
        return "ClaseDePrueba{" +
                "atr1='" + atr1 + '\'' +
                ", atr2='" + atr2 + '\'' +
                '}';
    }

    public String concatenar(String atr1, String atr2){
       String str3= atr1+atr2;
       return str3;
    }

    public void setAtr1(String atr1) {
        this.atr1 = atr1;
    }

    public String getAtr2() {
        return atr2;
    }

    public void setAtr2(String atr2) {
        this.atr2 = atr2;
    }


}
