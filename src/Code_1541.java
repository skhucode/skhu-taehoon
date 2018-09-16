import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Code_1541
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String [] minus = buffer.readLine().split("\\-"); //-분리
        int sum = 0;

        for (int i=0; i<minus.length; ++i)
        {
            int cycleSum=0;
            String[] plus = minus[i].split("\\+"); //+분리

            for (int j=0; j<plus.length; ++j)
                cycleSum += Integer.parseInt(plus[j]);

            if (i == 0)
                cycleSum *= -1;

            sum -= cycleSum;
        }
        System.out.println(sum);

    }
}
