import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_10430
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");

        int A = Integer.parseInt(temp[0]);
        int B = Integer.parseInt(temp[1]);
        int C = Integer.parseInt(temp[2]);
        System.out.println((A+B)%C);
        System.out.println((A%C+B%C)%C);
        System.out.println((A*B)%C);
        System.out.println((A%C*B%C)%C);
    }
}
