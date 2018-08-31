import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_9466_1
{
    static int[] student;
    static int[] finish;
    static boolean[] search;

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());

        for (int i=0; i<number; ++i)
        {
            int count = Integer.parseInt(buffer.readLine());
            StringTokenizer token = new StringTokenizer(buffer.readLine());
            student = new int[count+1]; finish = new int[count+1]; search = new boolean[count+1];
            for (int j=1; j<=count; ++j)
            {
                student[j] = Integer.parseInt(token.nextToken());
                finish[student[j]]++;
            }
            int sum=0;
            for (int j=1; j<=count; ++j)
            {
                int present = j;
                while (!search[present] && finish[present] == 0)
                {
                    search[present] = true;
                    finish[student[present]]--;
                    sum++;
                    present = student[present];
                }
            }
            System.out.println(sum);
        }

    }
}
