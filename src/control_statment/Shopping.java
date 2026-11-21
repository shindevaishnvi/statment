package control_statment;

public class Shopping {
	public static void main(String[] args) {
        int amount = 2000;
        String membership = "yes";
        double discount;

        if (amount > 1000) {
            if (membership.equals("yes")) {
                discount = amount * 20 / 100.0;
            } else {
                discount = amount * 10 / 100.0;
            }
        } else {
            discount = 0;
        }

        System.out.println("Discount = Rs. " + discount);
        System.out.println("Final Amount = Rs. " + (amount - discount));
    }
}
