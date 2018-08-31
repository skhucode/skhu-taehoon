import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Code_7576
{
    static int[][] array;
    static Queue<Store> queue = new LinkedList<>();
    static boolean[][] search;
    static int[] xMove={1,0,-1,0}; //남 동 북 서
    static int[] yMove={0,1,0,-1}; //남 동 북 서
    static int number1; //세로 수
    static int number2; //가로 수

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        number1 = Integer.parseInt(token.nextToken());
        number2 = Integer.parseInt(token.nextToken());

        array = new int[number2+1][number1+1];
        search = new boolean[number2+1][number1+1];
        for (int i=1; i<=number2; ++i)
        {
            StringTokenizer give = new StringTokenizer(buffer.readLine());
            for (int j=1; j<=number1; ++j)
            {
                array[i][j] = Integer.parseInt(give.nextToken());
                if (array[i][j] == 1) //익은 것을 저장하여 익은것부터 bfs
                {
                    search[i][j] = true; //익은 곳들은 방문을 해야한다.
                    queue.offer(new Store(i,j));
                }
            }
        }
        exploration();
        int sum=1;
        loop:for (int i=1; i<=number2; ++i)
            for (int j=1; j<=number1; ++j)
            {
                if (array[i][j] == 0) //안익은 상태이므로
                {
                    sum =0;
                    break loop;
                }
                else
                    sum = Math.max(sum, array[i][j]);
            }
        System.out.println(sum-1);
    }

    public static void exploration()
    {
        while (!queue.isEmpty())
        {
            Store store = queue.poll();
            for (int i=0; i<4; ++i)
            {
                int x_move = store.x + xMove[i];
                int y_move = store.y + yMove[i];

                if (x_move > number2 || y_move > number1 || x_move < 1 || y_move < 1) continue; //값의 범위가 넘을때
                if (search[x_move][y_move] || array[x_move][y_move] == -1) continue; //방문 했거나 이동 한 곳이 -1일때
                queue.offer(new Store(x_move,y_move));
                search[x_move][y_move] = true;
                array[x_move][y_move] = array[store.x][store.y]+1;
            }
        }
    }
}
class Store
{
    int x;
    int y;
    public Store(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
