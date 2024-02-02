package javatreceycatorce;

public class MyInstanceOf {

    public static void main(String[] args) {
        Object object = get();
        if (object instanceof String str){
            System.out.println(str);
        }
    }

    public static Object get(){
        return "Pattern matching action";
    }

}
