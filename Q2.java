import java.io.*;
class Q2
{
    private static int divide(int numerator, int denominator)
    {
        if(numerator<denominator)
        	return 0;
        return 1 + divide(numerator-denominator,denominator);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter second number:");
        int n2 = Integer.parseInt(br.readLine());
        int res  = divide(n1,n2);
        System.out.println("Quotient = " + res);

    }
}
