public class FindingLargestSmallestElement
 {
    public static void main(String[] args) 
    {
        int arr[] = new int[]{0,10,20,30,50 ,1000 ,2000 ,30000 ,100000,100000};

        int smallestnum =arr[0];

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] < smallestnum)
            {
                
                      smallestnum  = arr[i] ;

            }

        }

        System.out.println("SmallestNumber "+smallestnum);

           int LargestNumber = arr[0];

           for(int j=0; j<arr.length; j++)
             
           {
            if(arr[j] > LargestNumber)
            {
                LargestNumber  = arr[j];
                  
                 
            }

           }

           System.out.println("LargestNumberin arr is:- "+LargestNumber);


    }
    
}
