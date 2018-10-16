public class IfStatements
{
    public static void main( String[] args )
    {
        int a =65;
        boolean b = false;

        if( a >= 70 )
        {
            System.out.println("Hello 1");
            if( b == true )
                System.out.println("Hello 2");
        }
        else
        {
            System.out.println("Hello 3");
            if( b == false )
                System.out.println("Hello 4");
        }
        System.out.println("Done");
    }
}
