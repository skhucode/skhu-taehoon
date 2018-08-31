import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_9466
{
    //메모리 초과..
    static long[][] array;
    static boolean[] sear;
    static int sum;
    static int repeat;

    public static void search(int number, int exploration,int plus)
    {
        if(number == exploration && array[number][exploration] == 1) //자기 자신으로 사이클할때
        {
            sear[number] = true;
            sum += 1;
            return;
        }
        sear[number] = true;
        for (int i=1; i<=repeat; ++i)
        {
            if (array[number][i] == 1 && !sear[i])
                search(i,exploration,++plus);
            if (i == exploration && sear[i])
                sum += plus;
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        for (int i=0; i<number; ++i)
        {
            repeat = Integer.parseInt(buffer.readLine());
            array = new long[repeat+1][repeat+1];
            sear = new boolean[repeat+1];
            String[] temp = buffer.readLine().split(" ");
            for (int j=1; j<=repeat; ++j)
                array[j][Integer.parseInt(temp[j-1])] = 1;

            sum=0;
            for (int j=1; j<=repeat; ++j)
                if (!sear[j])
                    search(j,j,0);
            System.out.println(repeat - sum);
        }
    }
}
