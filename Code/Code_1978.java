import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1978
{
    static boolean[] temp;

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        temp = new boolean[1000001];
        for (int i=2; i<=1000; ++i)
            for (int j=2; i*j<=1000; ++j)
                temp[i*j] = true;

        temp[1] = true;
        int[] search = new int[number];
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        for (int i=0; i<number; ++i)
            search[i] = Integer.parseInt(token.nextToken());

        int count=0;
        for (int i=0; i<number; ++i)
            if (!temp[search[i]])
                ++count;
        System.out.println(count);

    }
}
