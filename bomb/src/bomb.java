public class bomb
{

    public static void main(String[] args)  throws InterruptedException {

        {
            int counter = 10;
            do
            {
                System.out.println(counter + " tot de bom opmloft!");
                counter--;
                Thread.sleep(1000);
            } while (counter !=0);
            System.out.println("BOOOOOOOMMMMMMMM!!!!");
        }
    }
}