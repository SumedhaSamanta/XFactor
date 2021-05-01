import java.io.*;
class Q1
{

    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter hour:");
        int h = Integer.parseInt(br.readLine());
        System.out.println("Enter minute:");
        int m = Integer.parseInt(br.readLine());
        double angle = Math.abs((30 * h)-(5.5 * m));
        System.out.println("Required angle: " + ((angle>180)?(360-angle):angle));

    }
}
