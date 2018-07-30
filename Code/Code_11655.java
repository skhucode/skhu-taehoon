import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11655
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp = buffer.readLine();
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<temp.length(); ++i)
        {
            int sum = temp.charAt(i) +13;
            if (Character.isUpperCase(temp.charAt(i)))
            {
                if (sum < 90)
                    builder.append(sum);
                else
                {
                    int tem = 65+(13 - (90-temp.charAt(i)))-1;
                    char t = (char)tem;
                    builder.append(t);

                }
            }
            else if (Character.isLowerCase(temp.charAt(i)))
            {
                if(sum < 123)
                    builder.append(sum);
                else
                    {
                        int tem = 97+(13 - (122-temp.charAt(i)))-1;
                        char t = (char)tem;
                        builder.append(t);
                }
            }
            else if(Character.isDigit(temp.charAt(i)))
                builder.append(temp.charAt(i));
            else
                builder.append(" ");
        }

        System.out.println(builder);
    }
}
