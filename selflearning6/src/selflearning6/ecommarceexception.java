package selflearning6;

import java.util.Scanner;

public class ecommarceexception {

    static class PaymentException extends Exception {
        public PaymentException(String message) { super(message); }
    }

    static class InventoryException extends Exception {
        public InventoryException(String message) { super(message); }
    }

    static class ShippingException extends Exception {
        public ShippingException(String message) { super(message); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the payment amount:");
        
        try {
            int payment = sc.nextInt();
            
            if (payment < 0) {
        
                throw new PaymentException("amount is not valid: " + payment);
            }
            
            System.out.println("Payment of " + payment + " processed successfully.");

        } catch (PaymentException e) {
        	
        	
            System.out.println("PAYMENT ERROR: " + e.getMessage());
        } 
        
       
        System.out.println("enter the shipping weightt:");
        
        try {
            int shippingweight = sc.nextInt();
            
            if (shippingweight > 50) {
        
                throw new PaymentException("shipping weight invalid " + shippingweight);
            }
            
            System.out.println("shipping weight  " + shippingweight + " processed successfully.");

        } catch (PaymentException e) {
        	
        	
            System.out.println("shipping error: " + e.getMessage());
        }
        
        
System.out.println("enter the shipping pincode:");
        
        try {
            int shippingaddress = sc.nextInt();
            
            if (shippingaddress !=411009) {
        
                throw new PaymentException("shipping pincode invalid " +shippingaddress);
            }
            
            System.out.println("shipping pincode   " + shippingaddress + " processed successfully.");

        } catch (PaymentException e) {
        	
        	
            System.out.println("shipping pincode error: " + e.getMessage());
        }
        
        
        
        
        try {
            int inventry = sc.nextInt();
            
            if (inventry < 10) {
        
                throw new PaymentException("inventry is not valid: " + inventry);
            }
            
            System.out.println("inventy list of " + inventry + " processed successfully.");

        } catch (PaymentException e) {
        	
        	
            System.out.println("inventry error: " + e.getMessage());
        } finally {
            sc.close();
        }
        
        
        
        
        
    }
    
    
    
}
