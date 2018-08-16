import java.util.Scanner;

public class Code_11022
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i=0; i<n; ++i)
        {
            int a = input.nextInt(); int b = input.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i+1,a,b,a+b);
        }
    }
}
