import java.util.Scanner;
public class DeleteArrayElemnts 

 {
    public static void main(String[] args) 
    {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size:-");
        n= sc.nextInt();
        
        int a[] = new int[n];
        int b[] = new int[n-1];
        
        
        System.out.println("Enter the Elements:");
        
        for(int i=0;i<n; i++)
        {
            a[i] = sc.nextInt();
            
        }
        System.out.println("Enter the index Deleted array Number:-");
         m=sc.nextInt();
         
         for(int i=0;i<a.length;i++)//a[i] = 10  20  30  40  50 
         {                         // b[i] 10 20   30
             if(i<m) 
             {
                 b[i] = a[i];
                 
             }
             else if(i==m)
             {
                   continue;           
}
            else{
                b[i-1] = a[i];
            }
            
             
         }
      System.out.println("The Elemnts are:-");
        for(int i=0; i<n; i++)
        {
            System.out.println(b[i]);
        }
        
        
    }
}
