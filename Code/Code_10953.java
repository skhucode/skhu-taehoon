import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_10953
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());

        for(int i=0; i<number; ++i)
        {
            String[] temp = buffer.readLine().split(",");
            System.out.printf("%d\n",Integer.parseInt(temp[0])+Integer.parseInt(temp[1]));
        }
    }
}
