import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Code_10845
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = input.nextInt();

        input.nextLine();
        for(int i=0; i<n; ++i)
        {
            String temp = input.nextLine();
            if(temp.equals("front"))
                System.out.println(queue.peek() == null ? -1 : queue.peek());
            else if(temp.equals("back"))
                System.out.println(((LinkedList<Integer>) queue).peekLast() == null ? -1 : ((LinkedList<Integer>) queue).peekLast());
            else if(temp.equals("empty"))
                System.out.println(queue.isEmpty() ? 1 : 0);
            else if(temp.equals("size"))
                System.out.println(queue.size());
            else if(temp.equals("pop"))
                System.out.println(queue.isEmpty() ? -1 : queue.poll());
            else
            {
                String[] tt = temp.split(" ");
                ((LinkedList<Integer>) queue).add(Integer.parseInt(tt[1]));
            }
        }

    }
}
