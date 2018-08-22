import java.util.Scanner;
public class Alphabetize2
{
    public static void main(String[] args)
    {
        String str1, str2, str3;
        String first, second, third;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        str1 = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second string: ");
        str2 = input2.nextLine();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the third string: ");
        str3 = input3.nextLine();

        if (str1.compareToIgnoreCase(str2) < 0 && str1.compareToIgnoreCase(str3) < 0)
        {
            first = str1;
            if (str2.compareToIgnoreCase(str3) < 0)
            {
                second = str2;
                third = str3;
            }
            else
            {
                second = str3;
                third = str2;
            }
        }
        else if (str2.compareToIgnoreCase(str1) < 0 && str2.compareToIgnoreCase(str3) < 0)
        {
            first = str2;
            if (str1.compareToIgnoreCase(str3) < 0)
            {
                second = str1;
                third = str3;
            }
            else
            {
                second = str3;
                third = str1;
            }
        }
        else
        {
            first = str3;
            if (str1.compareToIgnoreCase(str2) < 0)
            {
                second = str1;
                third = str2;
            }
            else
            {
                second = str2;
                third = str1;
            }
        }
        System.out.println(first + " " + second + " " + third);
    }
}
