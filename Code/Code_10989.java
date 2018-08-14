import java.io.*;
import java.util.Arrays;

public class Code_10989
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(buffer.readLine());
        int[] array = new int[number];

        for (int i=0; i<number; ++i)
            array[i] = Integer.parseInt(buffer.readLine());

        Arrays.sort(array);

        for (int i=0; i<number; ++i)
            writer.write(array[i] + "\n");
        writer.close();
    }
}
