import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Code_11724
{
    static int[][] array;
    static int num1;
    static boolean[] search;


    public static void find(int number)
    {
        search[number] = true;
        for (int i=1; i<=num1; ++i)
            if (array[number][i] ==1 && !search[i])
                find(i);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        num1 = Integer.parseInt(token.nextToken()); //정점의 개수
        int num2 = Integer.parseInt(token.nextToken()); //간선의 개수

        array = new int[num1+1][num1+1];
        search = new boolean[1001];
        for (int i=0; i<num2; ++i)
        {
            String[] temp = buffer.readLine().split(" ");
            int temp1 = Integer.parseInt(temp[0]);
            int temp2 = Integer.parseInt(temp[1]);
            array[temp1][temp2] = 1; array[temp2][temp1] =1; //무방향그래프이므로
        }

        int sum = 0 ;
        for (int j=1; j<=num1; ++j)
            if (!search[j])
            {
                ++sum;
                find(j);
            }
        System.out.println(sum);
    }

}
