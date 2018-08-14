import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11004
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        int[] array = new int[a];
        String[] tt = buffer.readLine().split(" ");
        for (int i=0; i<tt.length; ++i)
            array[i] = Integer.parseInt(tt[i]);

        
    }
}
