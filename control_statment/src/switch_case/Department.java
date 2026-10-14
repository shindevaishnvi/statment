package switch_case;

public class Department {
	public static void main(String[] args) {
		int dept=1;
		switch(dept) {
		case 1:
			System.out.println("computer");
			break;
		case 2:
			System.out.println("mechanical");
			break;
		case 3:
			System.out.println("civil");
			break;
		case 4:
			System.out.println("electrical");
			break;
		
		default:
			System.out.println("error");
		}
			
		}
}

