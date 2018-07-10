import java.util.*;

public class Code_7785
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int n = input.nextInt();
        input.nextLine();

        for(int i=0; i<n; ++i)
        {
            String[] temp = input.nextLine().split(" ");
            if(temp[1].equals("enter"))
                list.add(temp[0]);
            else
                list.remove(temp[0]); //leave면 remove
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int i=0; i<list.size(); ++i)
            System.out.println(list.get(i));

    }
}
