import java.util.*;


public class Bonus {

    public static void main(String[] args) {
//
        Mastermind game = new Mastermind();
        Set<Integer> randomNumbers = game.randomNumberGenerator();
        String numberString = Mastermind.setToStringConverter(randomNumbers);
        System.out.println("Generated number string: " + numberString);
    }
}


