import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mastermind {

    public static Set<Integer> randomNumberGenerator() {
        Set<Integer> randomNumbers = new HashSet<>();
        Random random = new Random();


        while (randomNumbers.size() < 4) {
            int randomNumber = random.nextInt(1000);
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;

    }

    public static String setToStringConverter(Set<Integer> randomNumbers) {
        StringBuilder string = new StringBuilder();

        for (Integer number : randomNumbers) {
            string.append(number);
        }
        return string.toString();
    }


}
//        /*
//        Vul hier de body van de methode in.
//
//        Stappenplan:
//        - Maak als eerst een String variabele met als waarde een lege String. (of gebruik een StringBuilder)
//        - Schrijf vervolgens een for-loop om de items in de hashset een voor een aan de String variabele toe te voegen.
//        - Return de (gevulde) String variabele
//         */
//    }
//
//
//
//    public static void/*moet dit "void" zijn of wat anders?*/ feedback(String stringnumber) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder feedback = new StringBuilder();
//        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
//        System.out.println("Doe een gok, Let op vul 4 getallen in.");
//        String guess = scanner.nextLine();
//        if (Objects.equals(guess, stringnumber)) {
//            System.out.println("gefeliciteerd je hebt het goed");
//        } else {
//            for (int i = 0; i < 4; i++) {
//                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
//                    feedback.append("+");
//                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
//                    feedback.append("0");
//                } else {
//                    feedback.append("X");
//                }
//            }
//        }
//        System.out.println(feedback.toString());
//    }
//}
