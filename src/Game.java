
import java.util.Scanner;

public class Game {

    private String correctLetters;
    private String wrongLetters;
    private String movieToGuess;
    private int points;

    public Game(String pathname) {
        Movie newMovie = new Movie(pathname);
        movieToGuess = newMovie.randomMovie();
        correctLetters = "";
        wrongLetters = "";
        points = 10;
    }

    public void startTheGame() {
        while (points != 0) {
            System.out.println("You are guessing: " + hiddenMovie());
            System.out.println("Guess a letter: ");
            System.out.println(getCorrectLetters());

            if (!hiddenMovie().contains("_")) {
                System.out.println("You win!");
                break;
            }

        }

        if (points == 0) {
            System.out.println("You loose!");
        }

        System.out.println("Full name of movie was: " + movieToGuess);
    }


    public String hiddenMovie() {
        if (!correctLetters.equals("")) {
            return movieToGuess.replaceAll("[a-zA-Z&&[^" + correctLetters + "]]", "_");
        } else {
            return movieToGuess.replaceAll("[a-zA-Z]", "_");
        }
    }


    public String getCorrectLetters() {
        Scanner usInput = new Scanner(System.in);
        String letter = usInput.nextLine();
        if (movieToGuess.contains(letter)) {
            if (!correctLetters.contains(letter)) {
                correctLetters += letter + " ";
            }
            return "\nCorrect letters are:  " + correctLetters;
        } else {
            if (!wrongLetters.contains(letter)) {
                wrongLetters += letter + " ";
                points--;
            }
            return "\nWrong letters are:  " + wrongLetters + "\nYour points: " + points;
        }
    }

}
