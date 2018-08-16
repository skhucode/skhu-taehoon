import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Score
{
    String name;
    int language;
    int english;
    int math;

    public Score(String name, int language, int english, int math)
    {
        this.name = name;
        this.language = language;
        this.english = english;
        this.math = math;
    }

    public String toString()
    {
        return name;
    }
}

public class Code_10825
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        Score[] scores = new Score[number];
        for (int i=0; i<number; ++i)
        {
            String[] temp = buffer.readLine().split(" ");
            String name = temp[0];
            int a = Integer.parseInt(temp[1]);
            int b = Integer.parseInt(temp[2]);
            int c = Integer.parseInt(temp[3]);
            scores[i] = new Score(name,a,b,c);
        }

        Arrays.sort(scores, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                int a = o2.language - o1.language;
                if (a != 0) return a;
                int b = o1.english - o2.english;
                if (b != 0) return b;
                int c = o2.math - o1.math;
                if (c != 0) return c;
                int d = o1.name.compareTo(o2.name);
                return d;
            }
        });

        for (int i=0; i<number; ++i)
            System.out.println(scores[i]);
    }
}
