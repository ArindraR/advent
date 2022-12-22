import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; // Import the Scanner class to read text files

public class Advent1 {
    public static void main(String[] args) {
        try {
            FileReader myObj = new FileReader("advent.data");
            Scanner myReader = new Scanner(myObj);
            ArrayList<Integer> elvsArray = new ArrayList<Integer>();

            int elvNumber = 1;
            int calories = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (!data.isEmpty()) {
                    calories = calories + Integer.valueOf(data);
                } else {

                    elvsArray.add(calories);
                    System.out.println("elf:" + elvNumber + " calories:" + calories);
                    calories = 0;
                    elvNumber++;
                }
                System.out.println(data);

            }
            myReader.close();
            System.out.println("elves" + elvsArray.size());
            Collections.sort(elvsArray, Collections.reverseOrder());

            System.out.println("Higest Value :" + elvsArray.get(0));

            int top3 = elvsArray.get(0).intValue() + elvsArray.get(1).intValue() + elvsArray.get(2).intValue();
            System.out.println("top 3 " + top3);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}