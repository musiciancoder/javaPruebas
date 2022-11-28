package breakandcontinue;

public class Main {

  public static void main(String[] args) {
Main myMain = new Main();
myMain.myBreak();
      System.out.println("");
myMain.myContinue();
  }

    public  void myBreak(){
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        System.out.println("Estoy fuera del while de break!");
    }

    public void myContinue(){
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++; //para que pueda seguir en el loop
continue;//vuelve al while sin swguir de aqui en adelante
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Estoy fuera del while de continue!");

    }

}
