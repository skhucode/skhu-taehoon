import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_2178
{
    static int[][] array;
    public static int search(int number1 , int number2) //number1 -> 행 , number2 -> 열
    {
        System.out.println(number1+" "+number2);
        int sum=0;
        if (number1 == 1 && number2 ==1 ) return 1; //종료조건
        if (number1 !=1) //맨위가 0이 아니라면
        {
            if (array[number1 - 1][number2] == 0) //탐색 하는 위치에서 위가 0일때
                return sum = search(number1, number2-1) + 1;
        }
        if (number1 == 1)//맨 위라면
        {
            if (array[number1][number2-1] !=0) //맨 위에 위치하고 왼쪽이 0이 아니라면
                return sum = search(number1, number2-1)+1;
            else if (array[number1+1][number2] != 0) //아래로 내려갈 수 있으면
                return sum =  search(number1+1,number2)+1; ///////////////////////////////////////////////////////
        }

        if (number2 !=1) //맨 왼쪽이 아니라면
            if (array[number1][number2-1] == 0 )
                return sum = search(number1-1,number2)+1; ////////////////////////////////////////////////////////
        if (number2 == 1 ) //맨왼쪽이라면
            return sum = search(number1-1,number2)+1;
        return sum = Math.min(search(number1-1,number2)+1, search(number1,number2-1)+1);

    }

    public static  void main(String[] args) throws IOException
    {
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer token = new StringTokenizer(buffer.readLine());
//        int number1 = Integer.parseInt(token.nextToken());
//        int number2 = Integer.parseInt(token.nextToken());
//
//        array = new int[number1+1][number2+1];
//
//        for (int i=1; i<=number1; ++i)
//        {
//            String [] temp = buffer.readLine().split("");
//            for (int j=1; j<=number2; ++j)
//                array[i][j] = Integer.parseInt(temp[j-1]);
//        }
//        System.out.println(search(number1,number2));
    }
}
