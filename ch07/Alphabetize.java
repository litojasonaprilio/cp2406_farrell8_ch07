import java.util.Scanner;
public class Alphabetize
{
    public static void main(String[] args)
    {
        String str1, str2, str3;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        str1 = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second string: ");
        str2 = input2.nextLine();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the third string: ");
        str3 = input3.nextLine();

        System.out.println(str1.compareToIgnoreCase(str2));
        if (str1.compareToIgnoreCase(str2) < 0 && str2.compareToIgnoreCase(str3) < 0 &&
                str1.compareToIgnoreCase(str3) < 0)
        {
            System.out.println("The string is in alphabetical order.");
        }
        else
        {
            System.out.println("The string is not in alphabetical order.");
        }
    }
}
