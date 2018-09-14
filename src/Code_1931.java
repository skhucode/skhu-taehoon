import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Code_1931
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        Borrow[] borrows = new Borrow[number];

        for (int i=0; i<number; ++i)
        {
            StringTokenizer token = new StringTokenizer(buffer.readLine());
            borrows[i] = new Borrow(Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()));
        }

        // 끝나는게 중요하므로 end를 먼저 정렬한 뒤에 start를 정렬한다.
        Arrays.sort(borrows, new Comparator<Borrow>() {
            public int compare(Borrow o1, Borrow o2) {
                int r = o1.end - o2.end;
                if (r != 0) return r;
                return o1.start - o2.start;
            }
        });

        int count =0;
        int end = -1;

        for (int i=0; i<borrows.length; ++i)
            if (borrows[i].start >= end)
            {
                count++;
                end = borrows[i].end;
            }

        System.out.println(count);
    }
}

class Borrow
{
    int start;
    int end;

    public Borrow(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
