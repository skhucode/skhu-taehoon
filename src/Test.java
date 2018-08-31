import java.io.IOException;
import java.util.Arrays;

public class Test
{
    public static void main(String[] args) throws IOException
    {
        int[] aa = new int[6];
        int[] bb = new int[6];

        for (int i=1; i<=4; ++i)
        {
            aa[i] = 1;
            bb[aa[i]]++;
        }
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));
    }
}

