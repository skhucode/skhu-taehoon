import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Code_1212
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Map<Character,String> map = new HashMap<>();
        map.put('0',"000"); map.put('1',"001"); map.put('2',"010"); map.put('3',"011");
        map.put('4',"100"); map.put('5',"101"); map.put('6',"110"); map.put('7',"111");
        String temp = buffer.readLine();

        StringBuilder builder = new StringBuilder();
        for (int i=0; i<temp.length(); ++i)
            builder.append(map.get(temp.charAt(i)));

        String store = builder.toString();
        for (int i=0; i<store.length(); ++i)
        {
            if (store.charAt(i) == '0')
                builder.delete(0,1);
            else
                break;
        }
        if (store.equals("000"))
            builder.append(0);
        System.out.println(builder);
    }
}
