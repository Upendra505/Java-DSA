import java.util.Scanner;
public class InsertArryaElements
{
     public static void main(String[] args) 
     {

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Size:-");
        int n = sc.nextInt();
         int array[]= new int[n];
        

         System.out.println("Enter Elements:");
         for(int i=0; i<=n; i++)
         {
            array[i]= sc.nextInt();
         }

         System.err.println("The Elements Are:");
         for(int i=0;i<=n;i++)
         {
            System.out.println(array[i]);
         }

        

    }
}