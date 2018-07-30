import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Code_1406
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp = buffer.readLine();
        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();

        for (int i=0; i<temp.length(); ++i)
            stackL.push(temp.charAt(i));

        int number = Integer.parseInt(buffer.readLine());
        for (int i=0; i<number; ++i)
        {
            String[] store = buffer.readLine().split(" ");
            if (store[0].equals("L")) {
                if (!stackL.isEmpty())
                    stackR.push(stackL.pop());
            }
            else if (store[0].equals("D")){
                if (!stackR.isEmpty())
                    stackL.push(stackR.pop());
            }
            else if(store[0].equals("B")){
                if (!stackL.isEmpty())
                    stackL.pop();
            }
            else
                stackL.push(store[1].charAt(0));
        }

        StringBuilder builder = new StringBuilder();
        while (!stackL.isEmpty())
            stackR.push(stackL.pop());
        while (!stackR.isEmpty())
            builder.append(stackR.pop());
        System.out.println(builder);
    }
}
