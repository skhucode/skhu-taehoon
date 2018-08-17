import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_11004
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");

        int number = Integer.parseInt(temp[0]);
        int digit = Integer.parseInt(temp[1]);
        int[] array = new int[number];
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        for (int i=0; i<number; ++i)
            array[i] = Integer.parseInt(token.nextToken());

        Arrays.parallelSort(array);
        System.out.println(array[digit-1]);
    }
}
