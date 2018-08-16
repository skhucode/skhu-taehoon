import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_2193
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        long [] temp = new long[number+1];
        temp[0] = 0; temp[1] =1;
        for (int i=2; i<=number; ++i)
            temp[i] = temp[i-1] + temp[i-2];
        System.out.println(temp[number]);
    }
}
