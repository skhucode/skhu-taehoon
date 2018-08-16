import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_2609
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = buffer.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        int number1 = a;
        int number2 = b;

        //유클리드 호제법을 이용하면 간편하게 구할 수 있다.
        while (a > 0)
        {
            if (a<b)
            {
                int store = a;
                a = b;
                b = store;
            }
            a = a%b;
        }
        System.out.println(b);
        System.out.println(number1*number2/b);
    }
}
