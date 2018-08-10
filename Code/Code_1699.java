import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_1699
{
    //테스트 케이스 다통과하고 해봤는데 어느점이 틀리지?
//    static int count;
//    static int botton=1;
//
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(buffer.readLine());
//
//        while (number != 1)
//        {
//            if (Math.pow(botton,2) == number)
//                break;
//            if (Math.pow(botton,2) < number)
//                botton++;
//            else
//            {
//                botton--;
//                count++;
//                number = Math.abs((int)Math.pow(botton,2) - number);
//                botton = 1;
//            }
//        }
//        System.out.println(count+1);
//
//    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        int[] array = new int[number+1];

        for (int i=1; i<=number; ++i)
        {
            array[i] = i;
            for (int j=1; j*j<=i; ++j)
                if (array[i-j*j]+1 < array[i])
                    array[i] = array[i-j*j]+1;
        }
        System.out.println(array[number]);
    }
}
