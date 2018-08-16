import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11655
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split("");

        for (int i=0; i<temp.length; ++i)
        {
            if ('A'<=temp[i].charAt(0) && temp[i].charAt(0) <='Z')
                System.out.printf("%c",(temp[i].charAt(0) - 'A'+13)%26+'A');
            else if ('a' <=temp[i].charAt(0) && temp[i].charAt(0) <= 'z')
                System.out.printf("%c",(temp[i].charAt(0) - 'a'+13)%26+'a');
            else
                System.out.printf("%c",temp[i].charAt(0));
        }
    }
}
