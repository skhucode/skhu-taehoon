import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code_1377
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        Map<Integer,Integer> map = new HashMap<>(); //정렬 되지 않은 상태
        Map<Integer,Integer> store = new HashMap<>(); //정렬 된 상태

        int[] array =new int[number];

        for (int i=0; i<number; ++i)
        {
            int result = Integer.parseInt(buffer.readLine());
            map.put(i+1, result);
            array[i] = result;
        }
        Arrays.parallelSort(array);
        for (int i=0; i<number; ++i)
            store.put(array[i], i+1);

        int max =0;
        for (int i=1; i<=number; ++i)
        {
            int key = map.get(i);
            if (i > store.get(key))
                if (max <  i - store.get(key))
                    max = i - store.get(key);
        }

        System.out.println(max+1);
    }
}
