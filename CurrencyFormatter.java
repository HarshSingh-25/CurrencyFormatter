
package currencyformatter;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author ajasp
 */
public class CurrencyFormatter {

    /**
     * Main method accepts user input for a payment amount and converts it into 
     * US, Indian, Chinese, and French currency respectively.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double payment = input.nextDouble();
      input.close();
    
      String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
      String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
      String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
      String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
      
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
    }
    
}
