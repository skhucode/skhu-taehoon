import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code_1260
{
    static int number1;
    static boolean[] search;
    static boolean[] bfsSearch;
    static StringBuilder dfsBuilder = new StringBuilder();
    static StringBuilder bfsBuilder = new StringBuilder();
    static int[][] array;

    public static void dfs(int number)
    {
        search[number] = true;
        dfsBuilder.append(number+" ");

        for (int i=1; i<=number1; ++i)
            if (array[number][i] == 1 && !search[i])
                dfs(i);
    }

    public static void bfs(int number)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(number);
        bfsSearch[number] = true;
        int store;
        while (!queue.isEmpty())
        {
            store = queue.poll();
            bfsBuilder.append(store+" ");
            for (int i=1; i<=number1; ++i)
            {
                if (array[store][i] == 1 && !bfsSearch[i])
                {
                    queue.offer(i);
                    bfsSearch[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        number1 = Integer.parseInt(token.nextToken());//정점
        int number2 = Integer.parseInt(token.nextToken());//간선
        int number3 = Integer.parseInt(token.nextToken());//탐색 시작할 정점의 번호
        array = new int[number1+1][number1+1];

        for (int i=0; i< number2; ++i)
        {
            StringTokenizer give = new StringTokenizer(buffer.readLine());
            int temp1 = Integer.parseInt(give.nextToken());
            int temp2 = Integer.parseInt(give.nextToken());
            //무방향 그래프이므로
            array[temp1][temp2] = 1;
            array[temp2][temp1] = 1;
        }

        search = new boolean[1001];
        dfs(number3);
        System.out.println(dfsBuilder);

        bfsSearch = new boolean[1001];
        bfs(number3);
        System.out.println(bfsBuilder);
    }
}
