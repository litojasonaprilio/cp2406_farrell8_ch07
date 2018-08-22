import java.util.Scanner;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        final int UPPER = 2;
        final int LOWER = 2;
        final int DIGITS = 2;
        String password;
        int length;
        int upper = 0;
        int lower = 0;
        int digits = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        password = input.nextLine();

        while (upper < UPPER || lower < LOWER || digits < DIGITS)
        {
            length = password.length();
            for (int i = 0; i < length; ++i)
            {
                char a = password.charAt(i);
                if (Character.isUpperCase(a))
                {
                    upper += 1;
                }
                else if (Character.isLowerCase(a))
                {
                    lower += 1;
                }
                else if (Character.isDigit(a))
                {
                    digits += 1;
                }
            }
            if (upper < UPPER || lower < LOWER || digits < DIGITS)
            {
                displayErrorMessage(UPPER, LOWER, DIGITS);
                System.out.println("Enter password: ");
                password = input.nextLine();
            }
        }

        System.out.println("Password is made.");
    }

    public static void displayErrorMessage(int u, int l, int d)
    {
        System.out.println("The password must have at least:" +
                "\n- " + u + " uppercase letters." +
                "\n- " + l + " lowercase letters." +
                "\n- At least " + d + " digits.");
    }
}
