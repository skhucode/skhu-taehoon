import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11057
{
    static int count;
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        long[][] array = new long[number][10];

        for (int i=0; i<10; ++i)
            array[0][i] = 1;

        for (int i=1; i<number; ++i)
            for (int j=0; j<10; ++j)
                for (int k=0; k<=j; ++k)
                {
                    array[i][j] += array[i-1][k];
                    array[i][j] %= 10007;
                }

        for (int i=0; i<10; ++i)
            count += array[number-1][i];
        System.out.println(count%10007);
    }
}
