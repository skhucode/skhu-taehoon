import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_11047
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        int number = Integer.parseInt(token.nextToken()); //동전 갯수
        int price = Integer.parseInt(token.nextToken()); //돈
        int countPrice = 0; // 동전 셀때 더해지는 변수
        int count = 0; //동전 갯수

        int[] array = new int[number];
        for (int i=0; i<number; ++i)
            array[i] = Integer.parseInt(buffer.readLine());

        for (int i=number-1; i>=0; --i)
        {
            /*
             * countPrice + array[i]를 하니까 틀렸다고 나오고 array[i] < price를 하니 정답이라 출력한다.
             * 왜그럴까? countPrice + array[i]를 해줘서 원래 금액보다 크면 못들어가게 했는데...
             */
            if (array[i] < price)
            {
                while (countPrice < price) //더해지는 변수가 더클때 멈추게 해라
                {
                    if (countPrice + array[i] > price) break;
                    countPrice += array[i];
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}
