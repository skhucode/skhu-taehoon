import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_1463
{
    static int [] temp = new int[1000001];
    /* 이 부분이 시간 초과 났다. 시간을 줄이려면 어떻게 해야 할까?
    public static int search(int n)
    {
        if (n == 1) //종료 조건
            return 0;
        if (n % 3 == 0)
            return Math.min(search(n/3)+1,search(n-1)+1);
        else if (n % 2 ==0)
            return Math.min(search(n/2)+1,search(n-1)+1);
        else
            return search(n-1)+1;
    }
    */
    //해결방법 -> memoization을 사용하자!
    public static int search(int n)
    {
        if (n == 1) //종료 조건
            return 0;
        if (temp[n] >0) return temp[n];
        temp[n] = search(n-1)+1;
        if (n % 3 == 0)
            temp[n]=Math.min(temp[n],search(n/3)+1);
        else if (n % 2 ==0)
            temp[n]= Math.min(temp[n],search(n/2)+1);
        return temp[n];
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(search(10));

    }
}
