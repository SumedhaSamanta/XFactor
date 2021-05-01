import java.io.*;
public class Q3 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter annual income:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter asset worth:");
        int b = Integer.parseInt(br.readLine());
        System.out.println((0.01 * a) + (0.0025 * b));
        
    }
}
