import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_9461
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        long[] array = new long[101];

        array[1] =1;
        array[2] =1;
        array[3] =1;
        array[4] =2;
        array[5] =2;

        for (int i=0; i<number; ++i)
        {
            int n = Integer.parseInt(buffer.readLine());
            if (n<=5)
                System.out.println(array[n]);
            else
            {
                for (int j=6; j<=n; ++j)
                    array[j] = array[j-1] + array[j-5];
                System.out.println(array[n]);
            }

        }

    }
}
