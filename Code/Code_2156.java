import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Code_2156
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int[] temp = new int[number];
        int[] dp = new int[number];

        for (int i=0; i<number; ++i)
            temp[i] = Integer.parseInt(buffer.readLine());

        if (1<=number)
        dp[0] = temp[0];
        if (2<=number)
        dp[1] = temp[1]+temp[0];
        if(3<=number)
        dp[2] = Math.max(dp[1],Math.max(dp[0]+temp[2],temp[1]+temp[2]));

        for (int i=3; i<number; ++i)
            dp[i] = Math.max(dp[i-1],Math.max(temp[i]+dp[i-2],temp[i]+temp[i-1]+dp[i-3]));

        System.out.println(dp[number-1]);
    }
}
