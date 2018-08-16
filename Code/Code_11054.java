import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Code_11054
{
    static int[] temp;
    static int[] progressArray;
    static int[] progressArray2;
    static int max;

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        temp = new int[number];
        progressArray = new int[number];
        progressArray2 = new int[number];
        String[] progress = buffer.readLine().split(" ");

        for (int i=0; i<number; ++i)
            temp[i] = Integer.parseInt(progress[i]);

        for (int i=0; i< number; ++i)
        {
            progressArray[i] = 1;//증가 수열
            for (int j=0; j<i; ++j)
                if (temp[j] < temp[i])
                    progressArray[i] = Math.max(progressArray[i],progressArray[j]+1);
        }

        for (int i=number-1; i>=0; --i)
        {
            progressArray2[i] = 1;
            for (int j=i; j<number; ++j)
                if (temp[j] < temp[i])
                    progressArray2[i] = Math.max(progressArray2[i],progressArray2[j]+1);
        }

        for (int i=0; i<number; ++i)
            max = Math.max(max,progressArray[i]+progressArray2[i]);
        System.out.println(max-1); //가운데 값이중복이기 때문

    }
}
