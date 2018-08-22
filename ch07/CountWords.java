import java.util.Scanner;
public class CountWords
{
    public static void main(String[] args)
    {
        String str;
        int words = 0;
        int length;
        boolean preCharWasPunc = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string >> ");
        str = input.nextLine();
        length = str.length();

        for (int i = 0; i < length; i++)
        {
            char s = str.charAt(i);
            if (s == ' ' || s == '.' || s == ',' || s == ';' ||
                    s == '?' || s == '!' || s == '-')
            {
                words++;
                if (preCharWasPunc)
                    words--;
                preCharWasPunc = true;
            }
            else
                preCharWasPunc = false;
        }
        if (!preCharWasPunc)
            words++;
        System.out.println("There are " + words + " words in the string");
    }
}
