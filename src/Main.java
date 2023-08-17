
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Guess the Movie!" +
                "\nThe rules are simple, the computer randomly picks a movie title, " +
                "and shows you how many letters it's made up of.");

        System.out.println("If you lose 10 points, game over! \nLet's start!");
        Game game = new Game("movies.txt");

        game.startTheGame();


    }
}