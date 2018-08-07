import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11055
{
    static int[] temp;
    static int[] progressionArray;
    static int max;
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine()); //첫번째 입력 받은 수
        temp = new int[number];
        progressionArray = new int[number];

        String[] progression = buffer.readLine().split(" ");
        for (int i=0; i<number; ++i)
            temp[i] = Integer.parseInt(progression[i]);

        for (int i=0; i<number; ++i)
        {
            progressionArray[i] = temp[i];
            for (int j=0; j<i; ++j)
                if (temp[j] < temp[i]) //증가 수열이므로
                    progressionArray[i] = Math.max(progressionArray[i],progressionArray[j]+temp[i]);
            max = Math.max(max,progressionArray[i]);
        }
        System.out.println(max);
    }
}
