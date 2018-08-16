import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Code_1676
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        BigInteger sum = new BigInteger("1");
        for (int i=1; i<=number; ++i)
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        String temp = sum.toString();

        int count = 0;
        for (int i=temp.length()-1; i>=1; --i)
        {
            if (temp.charAt(i) == '0')
                ++count;
            else
                break;
        }
        System.out.println(count);
    }
}
