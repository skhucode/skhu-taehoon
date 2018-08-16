import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//수정해야함
public class Code_11052
{
    static int[] temp = new int[1001];
    static int[] array = new int[1001];

    public static int search(int n)
    {
        if (n == 1 ) return array[n]=temp[n];
        if (array[n] > 0 ) return array[n];
        array[n] = Math.max(temp[n] + search(n-1),array[n]);
        return array[n];
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        String[] array = buffer.readLine().split(" ");
        for (int i=0; i<number; ++i)
            temp[i] = Integer.parseInt(array[i]);
        System.out.println(search(number));
    }
}
