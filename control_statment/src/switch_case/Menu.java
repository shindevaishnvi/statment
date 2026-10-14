package switch_case;

public class Menu {
	public static void main(String[] args) {
		int menu=10;
		switch(menu) {
		case 1:
			System.out.println("login");
			break;
		case 2:
			System.out.println("register");
			break;
		case 3:
			System.out.println("profile");
			break;
		case 4:
			System.out.println("logout");
			break;
		
		default:
			System.out.println("error");
		}
			
		}
}
