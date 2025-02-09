import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;



public class Currency {
    public static void start(Scanner scanner)
    {
        System.out.println("*******WELCOME TO CURRENCY CONVERTOR******");
        System.out.println("ENTER YOUR AMOUNT INDIAN CURRENCY AND SELECT YOUR CHOICE FOR CHANGE TO REQUIRE CURRENCY   ");
        System.out.println();
        System.out.println("Enter your amount :");
        long getamount = scanner.nextLong();
        if(getamount>0) {
            System.out.println("DO YOU WANT TO GO CURRENCY CONVERTER \n PRESS 1 OTHERWISE PRESS 2 TO EXIT ");
            int choice = scanner.nextInt();
           label : if(choice==1)
            {
                Converter(scanner,getamount);
                break label;
            }
            if(choice==2)
            {
                System.out.println("***EXITING****");
                return;
            }
        }
    }
    public static void Converter(Scanner scanner,long amount)
    {
        System.out.println("Enter the country name to change the currency :");
        String countryname = scanner.next().toUpperCase();
        Locale locale = new Locale("en",countryname);
        String converter = NumberFormat.getCurrencyInstance(locale).format(amount);
        System.out.println("        ******CHANGED CURRENCY DETAILS*******      ");
        System.out.println("Country name :"+countryname);
        System.out.println("Convert currency amount :"+converter);
        System.out.println("Do you want to see your entered details\n press 1 otherwise press 2 to exit");
        int cho=scanner.nextInt();
       label: if(cho==1) {

            System.out.println("       ******ENTERED DETAILS****        ");
            System.out.println("Country name :India");
            System.out.println("Amount :" + amount);
            break label;
        }
        if(cho==2)
        {
            System.out.println("      THANK YOU      ");
            return;
        }
    }

}
