import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Code_11653
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int i=2;

        while (true)
        {
            if (number == 1)
                break;
            if (number % i == 0)
            {
                System.out.println(i);
                number /= i;
            }
            else
                i++;
        }
    }
}