package switch_case;

public class Area {
    public static void main(String[] args) {
        int choice = 1;
        double r = 5, l = 10, b = 5, s = 4;

        switch(choice) {
            case 1:
                System.out.println(3.14 * r * r);
                break;

            case 2:
                System.out.println(l * b);
                break;

            case 3:
                System.out.println(s * s);
                break;

            default:
                System.out.println("error");
        }
    }
}

