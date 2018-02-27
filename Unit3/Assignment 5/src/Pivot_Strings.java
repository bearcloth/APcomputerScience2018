import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Pivot_Strings {

    public static String messageRecieve(Scanner scan)
    {
        String message = scan.nextLine();
        return message;
    }

    public static String pivotRecieve(Scanner scan)
    {
        String pivot = scan.nextLine();
        return pivot;
    }

    public static void pivotString(String message, String pivotString)
    {



    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String message = messageRecieve(scan);
        String pivotString = pivotRecieve(scan);

        pivotString(message, pivotString);


    }
}
