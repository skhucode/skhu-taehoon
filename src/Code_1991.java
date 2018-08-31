import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code_1991
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(buffer.readLine());
        Tree tree = new Tree();

        for (int i=0; i<number; ++i)
        {
            StringTokenizer token = new StringTokenizer(buffer.readLine());

        }

    }
}

class Node
{
    char data;
    Node left;
    Node right;

    public Node(char data) {
        this.data = data;
    }
}

class Tree
{
    Node root;

    public void add(char data, Node left, Node right)
    {
        if (root == null)
            root = new Node(data);

    }
}