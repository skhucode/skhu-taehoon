import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1929
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        boolean[] search = new boolean[b+1];

        search[1] = true;

        for (int i=2; i<=b; ++i)
            for (int j=2; i*j<=b; ++j)
                search[i*j] = true;

        for (int i=a; i<=b; ++i)
            if (!search[i])
                System.out.println(i);
    }
}
