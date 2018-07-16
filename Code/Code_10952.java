import java.util.Scanner;

public class Code_10952
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt())
        {
            int a = input.nextInt();
            int b = input.nextInt();
            if(a == 0 && b ==0)
                break;
            else
                System.out.printf("%d\n", a+b);
        }

    }
}
