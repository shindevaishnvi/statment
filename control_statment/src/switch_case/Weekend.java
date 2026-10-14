package switch_case;

public class Weekend {
	public static void main(String[] args) {
		int days=5;
		switch(days) {
		case 1,2,3,4,5:
			System.out.println("weekday");
		break;
		case 6,7:
		System.out.println("weekend");
		break;
		default:
			System.out.println("error");
		}
	}
	

}
