package java13and14;

public class SwitchExpressionDemo {

    public static void main(String[] args) {

        //Sin lambdas
        int key =2;
        String result= switch (key) {
            case 1: {
                yield "Choice 1";
            }
            default:
                yield "Invalid choice";
        };
        System.out.println(result);

        // Con lambdas
        int choice =2;
        String response =switch (choice){
            case 1->{
                yield "You have zero balance";
            }
            case 2->{
                yield "You sure you have money?";
            }
            default ->
                throw  new IllegalArgumentException("Unexpected value: " + choice);
        };
        System.out.println(response);
    }
}
