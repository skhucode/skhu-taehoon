import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Code_2178_1
{
    static int[][] array;
    static boolean[][] search;
    static int [] xMove={-1,0,1,0}; //북 서 남 동
    static int [] yMove={0,-1,0,1}; //북 서 남 동
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        int number1 = Integer.parseInt(token.nextToken());
        int number2 = Integer.parseInt(token.nextToken());

        array = new int[number1+1][number2+1];
        search = new boolean[number1+1][number2+1];

        for (int i=1; i<=number1; ++i)
        {
            String [] temp = buffer.readLine().split("");
            for (int j=1; j<=number2; ++j)
                array[i][j] = Integer.parseInt(temp[j-1]);
        }
        maze(1,1,number1,number2);
        System.out.println(Arrays.deepToString(array));
        System.out.println(array[number1][number2]);

    }

    public static void maze(int n, int m, int number1, int number2)
    {
        Queue<Data> queue = new LinkedList<>();
        queue.add(new Data(n,m));
        while (!queue.isEmpty()) {
            Data d = queue.poll();
            for (int i = 0; i < 4; ++i)
            {
                int x = d.n+xMove[i];
                int y = d.m+yMove[i];

                if (x < 1 || y < 1 || x > number1 || y > number2) //범위가 넘어갈때
                    continue;
                if (search[x][y])
                    continue;
                if (array[x][y] == 0)
                    continue;
                queue.add(new Data(x,y));
                search[x][y] =true;
                array[x][y] = array[d.n][d.m]+1;
            }

        }
    }
}
class Data //queue에 저장해야 하는데 n,m을 한꺼번에 받아야 하기 때문에
{
    int n;
    int m;

    public Data(int n, int m)
    {
        this.n = n;
        this.m = m;
    }
}
