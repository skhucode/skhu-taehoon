import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp = buffer.readLine();
        StringTokenizer token = new StringTokenizer(temp,"-");
        List<String> list = new ArrayList<String>();
        while (token.hasMoreTokens())
            list.add(token.nextToken());
        System.out.println(list);
    }
}

