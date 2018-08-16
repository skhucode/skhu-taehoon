import java.util.*;

public class Code_1764
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<String,Integer> hash = new HashMap<>();
        List<String> list = new ArrayList<>();

        int n,k = 0;
        int sum =0; //듣도 보지도 못한 명단의 수 세기

        n = input.nextInt(); //듣도 못한 사람의 수
        k = input.nextInt(); //보도 못한 사람의 수

        input.nextLine();//개행문자날림
        for(int i=0; i<n; ++i)
            hash.put(input.nextLine(),1);

        String a;
        for(int i=0; i<k; ++i)
            if(hash.get(a =input.nextLine()) != null)
            {
                ++sum;
                list.add(a);
            }
        System.out.println(sum);
        Collections.sort(list);
        for(int i = 0; i<list.size(); ++i)
            System.out.println(list.get(i));
    }
}
