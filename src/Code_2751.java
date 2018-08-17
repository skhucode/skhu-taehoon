import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class Code_2751
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int[] array = new int[number];
        for (int i=0; i<number; ++i)
            array[i] = Integer.parseInt(buffer.readLine());

        Arrays.parallelSort(array);
        for (int i=0; i<number; ++i)
            System.out.println(array[i]);
    }
}

