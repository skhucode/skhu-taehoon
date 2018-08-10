import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Code_9465
{
    static int[][] array;
    static int dp[][];
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number= Integer.parseInt(buffer.readLine());

        for (int i=0; i<number; ++i)
        {
            int n = Integer.parseInt(buffer.readLine());
            array = new int[2][n];
            dp = new int[2][n];
            for (int j=0; j<2; ++j)
            {
                String[] temp = buffer.readLine().split(" ");
                for (int k=0; k<n; ++k)
                    array[j][k] = Integer.parseInt(temp[k]);
            }

            dp[0][0] = array[0][0];
            dp[1][0] = array[1][0];
            dp[0][1] = dp[1][0] + array[0][1];
            dp[1][1] = dp[0][0] + array[1][1];

            for (int j=2; j<n; ++j)
            {
                dp[0][j] = Math.max(dp[1][j-1],dp[1][j-2])+array[0][j];
                dp[1][j] = Math.max(dp[0][j-1],dp[0][j-2])+array[1][j];
            }
            System.out.println(Math.max(dp[0][n-1],dp[1][n-1]));

        }

    }
}
