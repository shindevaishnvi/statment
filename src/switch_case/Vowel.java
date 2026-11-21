package switch_case;

public class Vowel {
public static void main(String[] args) {
	char vowel='t';
	
	switch(vowel) {
	case 'a','i','e','o','u','A','I','E','O','U':
		System.out.println("vowel");
		break;
	
	default:
		System.out.println("consonant");
	}
}
}
