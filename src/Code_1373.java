import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_1373
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp = buffer.readLine();

        StringBuilder builder = new StringBuilder(temp);
        StringBuilder result = new StringBuilder();
        String store ="";
        int sum=0;
        int essense = 2;

        while (builder.length() % 3 !=0)
            builder.insert(0,0);

        for (int i=0; i<temp.length(); i+=3)
        {
            store = builder.substring(i,i+3);
            for (int j=0; j<store.length(); ++j)
                sum += ((int)store.charAt(j)-48) * Math.pow(2,essense--);
            result.append(sum);
            sum = 0;
            essense =2;
        }

        System.out.println(result);
    }
}
