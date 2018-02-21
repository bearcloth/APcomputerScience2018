import java.util.Scanner;


public class Main {

    public static String userName;

    // The three bad strings
    public static String b1 = " ^^ ";
    public static String b2 = " qey ";
    public static String b3 = " $ ";

    // This function looks for the first whitespace to catch the user name
    public static String catchUser(String message)
    {
        String user = "";
        for(int i = 0; i < message.length(); i++)
        {
            user += message.charAt(i);
            if(message.charAt(i) == ' ')
            {
                break;
            }
        }

        return user;
    }

    public static void badOrClean(String message)
    {
        message += "          ";
        int c1 = 0, c2 = 0, c3 = 0;
        for(int i = 0; i < message.length(); i++)
        {
            if(i > message.length() - 5)
                break;
            if(message.substring(i, i+4).equals(b1))
                c1++;
        }
        for(int i = 0; i < message.length(); i++)
        {
            if(i > message.length() - 5)
                break;
            if(message.substring(i, i+5).toLowerCase().equals(b2))
                c2++;
        }
        for(int i = 0; i < message.length(); i++)
        {
            if(i > message.length() - 5)
                break;
            if(message.substring(i, i+3).equals(b3))
                c3++;
        }

        if(c1 == 0 && c2 == 0 && c3 == 0)
        {
            System.out.println("CLEAN");
        }
        else {
            System.out.println("BAD");
            System.out.println(userName);
            System.out.println("^^: " + c1);
            System.out.println("qey: " + c2);
            System.out.println("$: " + c3);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String message;

        System.out.println("Enter message board post: ");
        message = scan.nextLine();

        while(message == null || message.equals(""))
        {
            System.out.println("Enter message board post: ");
            message = scan.nextLine();
        }

        userName = catchUser(message);

        System.out.println("Results: \n\n\n");

        badOrClean(message);
    }
}
