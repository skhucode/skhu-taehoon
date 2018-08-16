import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Code_11652
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        long number = Integer.parseInt(buffer.readLine());
        Map<Long,Integer> map = new HashMap<>();
        for (int i=0; i<number; ++i)
        {
            long num = Long.parseLong(buffer.readLine());
            map.put(num, map.get(num) != null ? map.get(num)+1 : 1);
        }

        int max=0;
        long key=0;
        for (Map.Entry<Long,Integer> entry : map.entrySet())
        {
            if (max == entry.getValue())
                if (key > entry.getKey())
                    key = entry.getKey();
            if (max < entry.getValue())
            {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println(key);
    }
}
