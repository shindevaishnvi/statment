package switch_case;

public class Season {
	public static void main(String[] args) {
		int season=1;
		switch(season) {
		case 1,2,12:
			System.out.println("winter");
			break;
		case 3,4,5:
			System.out.println("summer");
			break;
		case 6,7,8:
			System.out.println("mansoon");
			break;
		
		default:
			System.out.println("error");
		}
			
		}
}
