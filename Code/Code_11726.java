import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11726
{
    static int[] temp = new int[1001]; //memoization
    public static int search(int n)
    {
        if (n == 1 || n == 0)
            return 1;
        if (temp[n] > 0) return temp[n];
        temp[n] = (search(n-1) + search(n-2)) % 10007;
        return temp[n];
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(search(Integer.parseInt(buffer.readLine())));
    }
}
