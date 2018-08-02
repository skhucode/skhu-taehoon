import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_9095
{
    static int [] temp = new int[11];

    public static int search(int n)
    {
            if (n == 0) return temp[n]=0; if (n == 1) return temp[n]=1;
            if (n == 2) return temp[n]=2; if (n == 3) return temp[n]=4;
            if (temp[n] > 0) return temp[n];
            temp[n] = search(n-1)+search(n-2)+search(n-3);
            return temp[n];
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        for (int i=0; i<n; ++i)
            System.out.println(search(Integer.parseInt(buffer.readLine())));
    }
}
