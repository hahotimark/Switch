package switchhw;

import java.util.Random;

public class Game {

    public void roll(PlayerGuesses playerGuess) throws Exception
    {
        PlayerGuesses rolledNumber;
        int number = ((new Random()).nextInt(6) + 1);


        switch(number)
        {
            case 2:
            case 4:
            case 6:
                /** Even */
                rolledNumber = PlayerGuesses.EVEN;
                break;

            case 1:
            case 3:
            case 5:
                /** Odd */
                rolledNumber = PlayerGuesses.ODD;
                break;

            default:
                /** Not possible */
                throw new Exception("Invalid number rolled!");
        }



        if(rolledNumber == playerGuess)
        {
            System.out.println("Win");
        }
        else
        {
            System.out.println("Lose");
        }
    }

}
