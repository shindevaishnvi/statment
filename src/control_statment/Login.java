package control_statment;

public class Login {
	 public static void main(String[] args) {
	        String username = "admin";
	        String password = "1234";

	        if (username.equals("admin") &&
	            password.equals("1234")) {
	            System.out.println("Login successful");
	        } else {
	            System.out.println("Invalid username or password");
	        }
	    }
	}

