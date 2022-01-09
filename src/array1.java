import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = input.nextInt();

        //defining the array
        int[] num = new int[size];

        System.out.println("Enter the elements of an array: ");
        //taking input of array
        for(int i =0;i<size;i++)
        {
             num[i]= input.nextInt();
        }

        System.out.println("Enter the target element");
        //target that we want to search
        int x = input.nextInt();

        int ans = ls(num,x);
        System.out.println("Your ans is: "+ans);


     //return -1 if element not found in the array.
    }
    static int ls(int[] num,int x)
    {
        if(num.length==0)
        {
            return -1;
        }
        for(int i =0;i<num.length;i++)
        {
            int element=num[i];
            if(element==x)
            {
                return i;
            }

        }
         return-1;
        // here size===num.length
    }
}
/*
take an array as input from the user and then search a given target 'x' and if it is found then print the index
otherwise return -1.
 */