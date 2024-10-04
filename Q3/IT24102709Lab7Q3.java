import java.util.Scanner;

public class IT24102709Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        for (int x = 1; x <= 5; x++) {
            System.out.print("Enter the total bill amount for customer " + x + ": ");
            double billAmount = scanner.nextDouble();
            
            System.out.print("Enter the mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            double discount = 0;
            double amountToPay = billAmount;
            
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = billAmount * 0.05; 
                amountToPay = billAmount - discount;
            } else if (paymentMode != 'O' && paymentMode != 'o') {
                System.out.println("Payment Mode is Not Valid");
                continue; 
            }
            
            
            System.out.println("Discount: $" + discount);
            System.out.println("Amount to be paid: $" + amountToPay);
            System.out.println(); 
        }
        
        
        
    }
}