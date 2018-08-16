import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11722
{
    static int[] temp;
    static int[] progressionArray;
    static int max;
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());

        temp = new int[number];
        progressionArray = new int[number];

        String[] progress = buffer.readLine().split(" ");
        for (int i=0; i<number; ++i)
            temp[i] = Integer.parseInt(progress[i]);

        for (int i=0; i<number; ++i)
        {
            progressionArray[i] = 1;
            for (int j=0; j<i; ++j)
                if (temp[j] > temp[i])
                    progressionArray[i] = Math.max(progressionArray[i],progressionArray[j]+1);
            max = Math.max(max, progressionArray[i]);
        }
        System.out.println(max);
    }
}
