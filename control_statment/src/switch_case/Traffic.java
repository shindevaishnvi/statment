package switch_case;

public class Traffic {
	public static void main(String[] args) {
		String colour="green";
		switch(colour) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		
		default:
			System.out.println("error");
		}
			
		}
}
