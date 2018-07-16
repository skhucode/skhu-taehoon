import java.util.Scanner;

public class Code_10951
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b = 0;
        while (input.hasNextInt())
            System.out.printf("%d\n", input.nextInt()+input.nextInt());
    }
}
