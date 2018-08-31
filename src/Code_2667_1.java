import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code_2667_1
{
    static int[][] array;
    static Queue<Coordinate> queue = new LinkedList<>();
    static boolean[][] search;
    static int[] xx = {0,0,1,-1}; //동 서 남 북
    static int[] yy = {1,-1,0,0}; //동 서 남 북
    static int figure;
    static int 총단지수;
    static int 각단지순;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        figure = Integer.parseInt(buffer.readLine());
        array = new int[figure+1][figure+1];
        search = new boolean[figure+1][figure+1];

        for (int i=1; i<=figure; ++i)
        {
            String[] temp = buffer.readLine().split("");
            for (int j=1; j<=figure; ++j)
                array[i][j] = Integer.parseInt(temp[j-1]);
        }

        for (int i=1; i<=figure; ++i)
            for (int j=1; j<=figure; ++j)
                if (!search[i][j] && array[i][j] == 1) {
                    총단지수++;
                    queue.offer(new Coordinate(i,j));
                    bfs();
                    list.add(각단지순);
                    각단지순 = 0;
                }
        Collections.sort(list);
        System.out.println(총단지수);
        for (int i=0; i<list.size(); ++i)
            System.out.println(list.get(i));

    }

    public static void bfs()
    {
        각단지순++;
        while (!queue.isEmpty())
        {
            Coordinate coordinate = queue.poll();
            search[coordinate.x][coordinate.y] = true;
            for (int i=0; i<4; ++i)
            {
                int x_move = coordinate.x + xx[i];
                int y_move = coordinate.y + yy[i];

                if (x_move < 1 || y_move < 1 || x_move > figure || y_move > figure) continue;// 값 범위 넘어가면
                if (search[x_move][y_move] || array[x_move][y_move] == 0) continue; //탐색 했거나 0이라면

                queue.offer(new Coordinate(x_move,y_move));
                search[x_move][y_move] = true;
                각단지순++;
            }
        }
    }
}


class Coordinate
{
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}