import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
    big[2] = big[1] = BigInteger.ONE;하고
    for(int i=3; ~~~)
    이렇게 했더니 오류가 발생했다.
    왜그럴까
 */

public class Code_10826
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        BigInteger[] big = new BigInteger[Math.max(n+1,2)];
        big[0] = BigInteger.ZERO;
        big[1] = BigInteger.ONE;
        for(int i=2; i<=n; ++i)
            big[i] = big[i-1].add(big[i-2]);
        System.out.println(big[n]);
    }
}
