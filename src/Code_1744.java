import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 *  음수 끼리 더하면 최대값이 높아진다
 *  1은 곱하는거 보다 더하는게 낫다.
 *  음수와 0을 곱하면 최대값이 높아진다.
 */
public class Code_1744
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int[] array = new int[number];
        int minus =0;
        int plus = number-1;
        int sum =0;

        for (int i=0; i<number; ++i)
            array[i] = Integer.parseInt(buffer.readLine());

        Arrays.parallelSort(array);

        for (; minus < plus; ++minus)
        {
            if (array[minus] < 1 && array[minus+1] <1)
                sum += array[minus] * array[++minus];
            else
                break;
        }

        for (; plus > 0 ; --plus)
        {
            if (1 < array[plus] && 1 < array[plus-1])
                sum += array[plus] * array[--plus];
            else
                break;
        }

        for ( ; minus <= plus ; ++minus)
            sum += array[minus];

        System.out.println(sum);
    }
}
