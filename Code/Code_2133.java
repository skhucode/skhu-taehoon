import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_2133
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int[] array = new int[number+2];

        array[0] = 1;
        array[2] = 3;

        for (int i=4; i<=number; i += 2)
        {
            array[i] = array[i-2] * 3;
            for (int j=4; j<=i; j+=2)
                array[i] += array[i-j] *2;
        }
        System.out.println(array[number]);
    }
}
