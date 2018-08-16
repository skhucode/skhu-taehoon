import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Code_10845
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(buffer.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<n; ++i)
        {
            String[] temp = buffer.readLine().split(" ");
            if (temp[0].equals("pop"))
                System.out.println(queue.isEmpty() ? -1 : queue.poll());
            else if(temp[0].equals("size"))
                System.out.println(queue.size());
            else if(temp[0].equals("empty"))
                System.out.println(queue.isEmpty() ? 1 : 0);
            else if(temp[0].equals("front"))
                System.out.println(queue.isEmpty() ? -1 : queue.peek());
            else if (temp[0].equals("back"))
                System.out.println(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).peekLast());
            else
                queue.add(Integer.parseInt(temp[1]));
        }
    }
}
