public class SortingArray 
{
    public static void main(String arga[])
    {
        int arr[] = new int[]{10,12,25,30,50,40};

        System.out.println("the Original array is :");
for(int i=0; i<arr.length;i++)
{
   System.out.println(arr[i]);
}
    for(int i=0; i<arr.length; i++)
    {
        for (int j =i+1 ; j <arr.length; j++) 
        {
            int temp=0;
            if(arr[i]>arr[j])
            {
                temp = arr[i];//Sorting array in ascending order 
                arr[i]= arr[j];
                arr[j]= temp;
            }

        }
           
        System.out.println("Sorting array in ascending order "+arr[i]+" ");
    }
  



    }
    
}
