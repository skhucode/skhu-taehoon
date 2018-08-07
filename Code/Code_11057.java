import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_11057
{
    static int division = 10007;
    static long[][] temp;

    public static long search(int number, int cipher)
    {
        if (number == 1) return 1;
        if (temp[number][cipher] > 0) return temp[number][cipher]; //memoization

        if (cipher == 0)
            temp[number][cipher] = search(number-1,0) % division;
        else if (cipher == 9)
            temp[number][cipher] = search(number-1,8) % division;
        else
            temp[number][cipher] = search(number-1,cipher-1)% division + search(number-1,cipher+1) % division;
        return temp[number][cipher] % division;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());

        long result = 0;
        for (int i=0; i<=9; ++i)
            result += search(number,i);
        System.out.println(result % division);
    }
}
