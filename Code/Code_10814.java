import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Person
{
    int age;
    String name;
    int number;

    public Person(int age, String name,int number)
    {
        this.age = age;
        this.name = name;
        this.number =number;
    }

    public  String toString()
    {
        return age+" "+name;
    }
}

public class Code_10814
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        Person[] person = new Person[number];

        for (int i=0; i<number; ++i)
        {
            String[] temp = buffer.readLine().split(" ");
            person[i] = new Person(Integer.parseInt(temp[0]),temp[1],i);
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int r = o1.age - o2.age;
                if (r != 0 ) return r;
                return o1.number - o2.number;
            }
        });

        for (int i=0; i<number; ++i)
            System.out.println(person[i]);
    }
}
