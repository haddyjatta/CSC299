import java.util.Scanner;

public class lab2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the decimal number to be converted: ");
        int decimal = scanner.nextInt();
        
        if(decimal < 0) 
        {
            System.out.println("Negative decimal value is invalid.");
            return;
        }
        
        System.out.print("Enter the base value to convert to (between 2 - 16): ");
        int base = scanner.nextInt();
        
        if(base < 2 || base > 16) 
        {
            System.out.println("Try a value between 2 - 16.");
            return;
        }
        
        String convertedValue = convertToBase(decimal, base);
        
        System.out.println("Decimal " + decimal + " in base-" + base + " is: " + convertedValue);
    }
    
    public static String convertToBase(int decimal, int base) 
    {
        StringBuilder result = new StringBuilder();
        
        while(decimal > 0) {
            int remainder = decimal % base;
            if(remainder < 10) 
            {
                result.insert(0, remainder);
            } else 
            {
                result.insert(0, (char)('A' + remainder - 10));
            }
            decimal /= base;
        }
        
        return result.toString();
    }
}