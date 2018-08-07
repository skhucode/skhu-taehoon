import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_8958
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());

        for (int i=0; i<number; ++i)
        {
            String temp = buffer.readLine();
            int sum = 0; //더하는 수를 저장하는 변수
            int count = 0; //연속적인 O을 체크하는 변수
            for (int j=0; j<temp.length(); ++j)
            {
                if (temp.charAt(j) == 'O')
                        sum += count+=1;
                else
                    count = 0; //초기화
            }
            System.out.println(sum);
        }

    }
}
