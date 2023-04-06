import java.io.*;
import java.util.*;

// Defining a static inner class named Result
class findDayofDate_HackerRank{

    static class Result {
        // Defining a method named findDay which takes three parameters of integer data type
        public static String findDay(int month, int day, int year) {

            // Creating an instance of the Calendar class
            Calendar cal = Calendar.getInstance();
            // Setting the value of year, month, and day to the instance of the Calendar class
            cal.set(year,month-1, day);

            // Returning the name of the day of the week for the given date
            return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        }
    }
    // Defining the main method
    public static void main(String[] args) throws IOException {
        // Creating a new BufferedReader instance to read from standard input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Creating a new BufferedWriter instance to write to standard output
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Reading the input from the user and splitting it by whitespace
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // Parsing the integers from the firstMultipleInput array
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Calling the findDay method of the Result class and storing the result in a string variable
        String res = Result.findDay(month, day, year);

        // Writing the result to standard output
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        // Closing the buffered reader and writer instances
        bufferedReader.close();
        bufferedWriter.close();
    }

}

