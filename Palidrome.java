public class Palidrome
{
    public static void main(String[] args)
    {
        String  s= "131";
        String ans = " ";
        for(int i =s.length()-1;i>=0;i--)
        {
            ans = ans + s.charAt(i);
            
        }
        System.out.println(ans);
        
        
        if( s.equals(ans))
        {
            System.out.println("its palidrome");
        }
        else
        {
             System.out.println("its NOT!a palidrome");
        }
        
    }
}