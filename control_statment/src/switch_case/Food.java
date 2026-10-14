package switch_case;

public class Food {
	public static void main(String[] args) {
		int menu=3;
		switch(menu) {
		case 1:
			System.out.println("pizza");
			break;
		case 2:
			System.out.println("burger");
			break;
		case 3:
			System.out.println("sandwich");
			break;
		case 4:
			System.out.println("pasta");
			break;
		
		default:
			System.out.println("error");
		}
			
		}
}
