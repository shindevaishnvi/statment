package control_statment;

public class Grade_system {
	 public static void main(String[] args) {
	        int marks = 85;

	        if (marks >= 40) {
	            if (marks >= 90) {
	                System.out.println("Grade A");
	            } else if (marks >= 75) {
	                System.out.println("Grade B");
	            } else {
	                System.out.println("Grade C");
	            }
	        } else {
	            System.out.println("Fail");
	        }
	    }
}
