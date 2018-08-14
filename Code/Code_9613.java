import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_9613
{
    public static int gcd(int a, int b)
    {
        if (a<b)
        {
            int temp =a;
            a = b;
            b = temp;
        }
        return a%b == 0 ? b : gcd(a%b,b);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int[] array;
        long sum = 0;//공약수의 합

        for (int i=0; i<number; ++i)
        {
            String[] temp = buffer.readLine().split(" ");
            int plus = Integer.parseInt(temp[0]);
            array = new int[plus];

            for (int j = 0; j< plus; ++j)
                array[j] = Integer.parseInt(temp[j+1]);

            for (int j=0; j<plus; ++j)
                for (int k=j+1; k<plus; ++k)
                    sum += gcd(array[j],array[k]);
            System.out.println(sum);
            sum =0;
        }

    }
}
