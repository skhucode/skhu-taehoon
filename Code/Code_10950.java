import java.util.Scanner;

public class Code_10950
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=0; i<n; ++i)
            System.out.printf("%d\n",input.nextInt()+input.nextInt());
    }
}
