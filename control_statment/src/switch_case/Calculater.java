package switch_case;

public class Calculater {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int choice = 1;

        switch(choice) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

            default:
                System.out.println("error");
        }
    }


}

