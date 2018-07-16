import java.util.Scanner;

public class Code_11021
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=0; i<n; ++i)
            System.out.printf("Case #%d: %d\n",i+1, input.nextInt()+input.nextInt());
    }
}
