package Java;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0 ; i < 5; i++)
        {
            arr[i] = reader.nextInt();
        }
        int res = sum(arr);
        System.out.println(res);
        reader.close();
    }

    public static int sum(int a[])
    {
        int res = 0;
        for (int i = 0 ; i < 5; i++)
        {
            res += a[i];
        }
        return res;
    }
}
