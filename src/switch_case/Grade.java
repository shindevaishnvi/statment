package switch_case;

public class Grade {
	public static void main(String[] args) {
		
		char grade='D';
		switch(grade) {
		case 'A':
			System.out.println("excellent");
			break;
		case'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("average");
			break;
		case 'D':
			System.out.println("pass");
			break;
		case 'F':
			System.out.println("fail");
			break;
		
		default:
			System.out.println("error");
		}
	}

}
