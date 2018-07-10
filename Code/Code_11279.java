import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Code_11279
{
    static class Compare implements Comparator<Integer>
    {
        @Override
        public int compare(Integer a , Integer b)
        {
            return b.compareTo(a);
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>(1,new Compare());

        int n = input.nextInt();

        for(int i=0; i<n; ++i)
        {
            int temp = input.nextInt();
            if(temp == 0 && queue.isEmpty())
                System.out.println(0);
            else if(temp ==0 && !queue.isEmpty())
                System.out.println(queue.poll());
            else
                queue.offer(temp);
        }
    }
}
