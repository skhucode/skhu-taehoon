import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Code_1076
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

        HashMap<String,Integer> hash = new HashMap<>();
        List<String> list= new ArrayList<>();

        hash.put("black",1); hash.put("brown",10);hash.put("red",100);
        hash.put("orange",1000); hash.put("yellow",10000);hash.put("green",100000);
        hash.put("blue",1000000); hash.put("violet",10000000);hash.put("grey",100000000);
        hash.put("white",1000000000);

        list.add("black"); list.add("brown"); list.add("red"); list.add("orange");
        list.add("yellow"); list.add("green"); list.add("blue"); list.add("violet");
        list.add("grey"); list.add("white");

        String result = "";
        for(int i=0; i<3; ++i)
        {
            if(i != 2)
            {
                String temp = String.valueOf(list.indexOf(input.nextLine()));
                result += temp;
            }
            else
                System.out.println(hash.get(input.nextLine())* Integer.parseInt(result));
        }
    }
}
