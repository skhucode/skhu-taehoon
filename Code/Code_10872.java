import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_10872
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int sum = 1;

        for (int i=1; i<=number; ++i)
            sum *= i;

        System.out.println(sum);
    }
}
