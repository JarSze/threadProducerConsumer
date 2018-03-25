/**
 * Created by jszeligowski on 2018-03-25.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println("Hello world");
        Thread newThread=new Thread( ()-> System.out.println("Hello from another thread") );
        newThread.start();
    }
}
