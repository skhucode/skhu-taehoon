import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1934
{
    public static int recursive(int number1, int number2)
    {
        if (number1<number2)
        {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        return number1 % number2 == 0 ? number2 : recursive(number1%number2,number2);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());

        for (int i=0; i<number; ++i)
        {
            StringTokenizer token = new StringTokenizer(buffer.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            System.out.println(a*b/recursive(a,b));
        }

    }
}
