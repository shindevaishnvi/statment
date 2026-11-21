package control_statment;

public class Atm {
	 public static void main(String[] args) {
	        int balance = 5000;
	        int amount = 1000;

	        if (balance >= amount) {
	            if (amount % 100 == 0) {
	                System.out.println("Withdrawal successful");
	            } else {
	                System.out.println("Invalid denomination");
	            }
	        } else {
	            System.out.println("Insufficient balance");
	        }
	 }
	 
}
