import java.util.Scanner;

public class InsertIndexElement 
{public static void main(String[] args) 
    {
        int n,m,p;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Array Size:");
          n = sc.nextInt();
          int a[] = new int[n];
          int b[] = new int[n+1];
          
        System.out.println("Enter the Elements:");
        for(int i=0;  i<n; i++ )
        {
            a[i]= sc.nextInt();
        }
        
        System.out.println("ENTER THE index value :");
            m = sc.nextInt();
            
        System.out.println("Enter the Element:");
            p = sc.nextInt();
            
            for(int i=0; i<n+1; i++)
            {
                if(i<m)
                {
                    b[i] = a[i];
                }
                else if (i==m)
                {
                   b[i] = p;
                }
                else
                {
                    b[i] = a[i-1];
                }
            }
        System.out.println("The Elements are:-");
        for(int i =0; i<n;  i++)
        {
            System.out.println(b[i]);
        }
          
          
          
        
        
      
    }
}