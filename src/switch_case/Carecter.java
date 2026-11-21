package switch_case;

public class Carecter {
public static void main(String[] args) {
	char alphabet='a';
	switch(alphabet) {
	case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z':
		System.out.println("UPPERCASE");
		break;
	case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z':
		System.out.println("LOWERCASE");
		break;
	case '0','1','2','3','4','5','6','7','8','9':
		System.out.println("DIGIT");
		break;
	
	default:
		System.out.println("error");
	}
}
}
