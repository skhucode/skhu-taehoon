import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_11005
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        StringBuilder builder = new StringBuilder();

        int number1 = Integer.parseInt(token.nextToken());
        int number2 = Integer.parseInt(token.nextToken());

        while (number1 > 0)
        {
            if (number1 % number2 < 10)
            {
                builder.insert(0,number1 % number2);
                number1 /= number2;
            }
            else
            {
                builder.insert(0, (char)((number1%number2)+55)); //A가 아스키코드 55이므로
                number1 /= number2;
                System.out.println(number1);
            }
        }
        System.out.println(builder);
    }
}
