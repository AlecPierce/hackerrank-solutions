import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER p
     * 
     * Function Description
     * 
     * int n: the number of pages in the book
     * int p: the page number to turn to
     * 
     * Returns
     * 
     * int: the minimum number of pages to turn
     * 
     * Input Format
     * 
     * The first line contains an integer, the number of pages in the book.
     * The second line contains an integer, the page to turn to.
     */

    public static int pageCount(int n, int p) {
        int totalTurnsFromFront = p / 2;
        int totalTurnsFromBack = (n / 2) - (p / 2);
        return Math.min(totalTurnsFromFront, totalTurnsFromBack);
    }
}

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
