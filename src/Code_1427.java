import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code_1427
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader  buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split("");
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<temp.length; ++i)
            list.add(Integer.parseInt(temp[i]));

        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<list.size(); ++i)
            builder.append(list.get(i));
        System.out.println(builder);

    }
}
