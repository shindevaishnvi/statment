package switch_case;

public class Atm {
	public static void main(String[] args) {
		int atm=3;
		switch(atm) {
		case 1:
			System.out.println("check balance");
			break;
		case 2:
			System.out.println("withdraw");
			break;
		case 3:
			System.out.println("deposit");
			break;
		case 4:
			System.out.println("exit");
			break;
		
		default:
			System.out.println("error");
		}
			
		}
}
