package bridgelab;

public class SnakeLadder
{
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int START = 0;

    public static void main(String[] args)
    {
        int start = 0;
        System.out.println("Starting position of player is: " + start);
        int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println(roll);
        int pos = 0;
        System.out.println("Starting position of player is: " + START);
        int roll1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Number on rolled dice is : " +roll1);
        int con = (int) (Math.floor(Math.random() * 10) % 3);
        System.out.println("Condition: " +con);

        switch (con)
        {
            case NO_PLAY:
                System.out.println("New Position is: " + pos);
                break;
            case LADDER:
                pos = pos + roll1;
                System.out.println("New Position is: " + pos);
                break;

            case SNAKE:
                pos = pos - roll1;
                if ( pos >= 0)
                    System.out.println("New Position is: " + pos);
                else
                    pos = 0;
                System.out.println("New Position is: " + pos);
                break;

            default:
                System.out.println("Default");
                break;
        }
    }



}

