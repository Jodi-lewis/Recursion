import java.util.Scanner;
public class Recursion {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter the sentence to calculate number of vowels : ");
        String str = sc.nextLine();

        System.out.print("The Number of Vowels are: " + countVowels (str)+"\n");
    }
    public static int countVowels(String str)
    {
        int count = 0;
        for (int q =0; q < str.length(); q++)


        if (str.charAt(q) == 'a'|| str.charAt(q) == 'e' ||str.charAt(q) == 'i'
                ||str.charAt(q) == 'o' || str.charAt(q) == 'u')
        {
            count++;
        }
            return count;

    }
}
