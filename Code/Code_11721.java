import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11721
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp = buffer.readLine();

        for (int i=0; i<temp.length(); ++i)
        {
            if(i == 0 || i % 10 != 0)
                System.out.print(temp.charAt(i));
            else
                System.out.print("\n"+temp.charAt(i));
        }

    }
}
