import java.util.Scanner;

public class Game {

    private int[] arr;
    private int remaining;
    private String plyName;

    public Game()
    {
        arr = new int[12];
        remaining = 0;
        int num = 1;

        for(int i = 0;i<arr.length;i++)
        {
            arr[i]= num;
            num++;
        }
    }

    public void setRemaining(int val) {remaining = val;}

    public String getPlyName()
    {
        return plyName;
    }
    public void setPlyName(String name)
    {
        plyName = name;
    }
    public void enterGame()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play Shut The Box. Enter (y/n) to play.");
        String playAns = scan.next();

        System.out.println("Enter your name!");
        plyName = scan.next();

        if(playAns.equals("y"))
            startGame();
        else{
            System.out.println("Oh well, next time!");
        }
    }
    public void startGame(){
        System.out.println("Starting game! \nRoll your dice!");
        boolean go = true;
        //Scanner remove = new Scanner(System.in);
        int num=0;

        while(go)
        {
            boolean done = true;
            int dice1 = (int) ((Math.random() * 6) +1) ;
            int dice2 = (int) ((Math.random() * 6) +1) ;

            System.out.println("Dice one is a "+ dice1+ " and dice two is a "+ dice2 +"\n ");

                System.out.println("Please enter the values you would like to knock out (they will be replaced by zeros and will not be able to played again). \nEnter '-1' when you are finished.");
                num=0;
                while(num!=-1)//input missmatch
                {

                    Scanner remove = new Scanner(System.in);
                     num = remove.nextInt();
                    for(int i =0;i<arr.length;i++)
                {
                    if(arr[i]==num)
                    {
                        arr[i]=0;
                    }

                }

            }

            System.out.println("Have you run out of tiles to flip? Enter (y/n).");
            Scanner runOut = new Scanner(System.in);
            if(runOut.next().equals("y")) {
                go = false;
                System.out.println("Your turn has ended");
            }
            printBoard();
        }
    }

    public int getRemaining()
    {
        for(int i =0;i<arr.length;i++)
        {
            remaining += arr[i];
        }
        return remaining;
    }
    public void printBoard()
    {

        for(int i = 0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length-1]+"\n");
    }

}
