package switch_case;

public class M_menu {
	public static void main(String[] args) {
		int menu=10;
		switch(menu) {
		case 1:
			System.out.println("wifi");
			break;
		case 2:
			System.out.println("bluetooth");
			break;
		case 3:
			System.out.println("mobile data");
			break;
		case 4:
			System.out.println("airplane mode");
			break;
		
		default:
			System.out.println("error");
		}
			
		}
}
