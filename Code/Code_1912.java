import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_1912
{
    static int[] temp;
    static int[] array;
    static int max;
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        temp = new int[number];
        array = new int[number];

        int count = 0;
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        while (token.hasMoreTokens())
            temp[count++] = Integer.parseInt(token.nextToken());

        array[0] = temp[0];
        max = array[0];
        for (int i=1; i<number; ++i)
        {
            array[i] = Math.max(temp[i]+array[i-1],temp[i]);
            max = Math.max(max,array[i]);
        }
        System.out.println(max);
    }
}
