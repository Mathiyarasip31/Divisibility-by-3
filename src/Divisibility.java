import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println(divisible(array));
    }
    public static int divisible(int array[])
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        if(sum%3==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
