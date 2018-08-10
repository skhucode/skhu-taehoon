import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_2579
{
    static int[] temp;
    static int[] maxArray;

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        temp = new int[number];
        maxArray = new int[number];

        for (int i=0; i<number; ++i)
            temp[i] = Integer.parseInt(buffer.readLine());

        maxArray[0] = temp[0];
        maxArray[1] = Math.max(temp[1],temp[0]+temp[1]);
        maxArray[2] = Math.max(temp[0]+temp[2],temp[1]+temp[2]);

        for (int i=3; i<number; ++i)
            maxArray[i] = Math.max(temp[i]+maxArray[i-2],temp[i]+temp[i-1]+maxArray[i-3]);
        System.out.println(maxArray[number-1]);
    }
}
