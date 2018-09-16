import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_2875
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        int girl = Integer.parseInt(token.nextToken());
        int man = Integer.parseInt(token.nextToken());
        int intern = Integer.parseInt(token.nextToken());
        int count = 0;

        //남아 있어야 할 인원수가 한팀 이상이여야 하므로 +3
        while (girl >= 2 && man >= 1 &&  girl+ man >= 3 + intern)
        {
            girl -= 2; man -= 1;
            count++;
        }

        System.out.println(count);
    }
}
