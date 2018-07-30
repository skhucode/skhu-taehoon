import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code_11656
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp = buffer.readLine();
        List<String> list = new ArrayList<>();

        for (int i=0; i<temp.length(); ++i)
            list.add(temp.substring(i,temp.length()));

        Collections.sort(list);
        for (String out : list)
            System.out.println(out);
    }
}
