import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Code_11399
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine()); //사람 수
        int[] time = new int[number]; //시간 수

        StringTokenizer token = new StringTokenizer(buffer.readLine());
        for (int i=0; i<number; ++i)
            time[i] = Integer.parseInt(token.nextToken());

        Arrays.parallelSort(time);

        int sum =0;
        int finalSum=0;

        for (int i=0; i<number; ++i)
            finalSum += sum += time[i];

        System.out.println(finalSum);
    }
}
