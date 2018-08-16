import java.util.Scanner;

public class Code_11720
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        String[] temp = input.nextLine().split("");
        int sum = 0;
        for(int i=0; i<n; ++i)
            sum += Integer.parseInt(temp[i]);
        System.out.printf("%d",sum);
    }
}
