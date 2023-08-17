import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class Movie {

    private ArrayList<String> listOfMovies;
    private int randomMovieIndex;

    /**
     * Constructor that initialize an object from a file.
     * @param pathname Path to the file
     */
    public Movie(String pathname){
        listOfMovies = new ArrayList();
        File file = new File(pathname);
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()){
                listOfMovies.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    /**
     * Method that generates random integer in the range 0 to n(exclusive) and then
     * returns random movie using that number as integer
     * @return random movie title from the list.
     */

    public String randomMovie(){
        Random r = new Random();
        //The nextInt() method can be used to generate a random integer.
        // If we pass a positive parameter n to this method
        // then it will return a random number in the range 0 to n(0 inclusive, n exclusive).
        randomMovieIndex = r.nextInt(listOfMovies.size());
        return listOfMovies.get(randomMovieIndex);
    }
}
