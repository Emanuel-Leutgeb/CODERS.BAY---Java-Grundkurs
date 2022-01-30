import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main_CeaserChiffre {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(24) + 2; //Random number between 2 and 24

        /*------------------------------------------------------------------------------------------------------------*/

        //Input Textfile
        File inputFile = new File("/Users/emanuelleutgeb/IdeaProjects/demo/Aufgabe15_CeaserChiffre/inputText.txt");
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //Read Textfile and save it to String
        //String inputWords = "";
        String line;

        String inputWords = scan.next();

        while ((line = bufferedReader.readLine()) != null) {
            inputWords += line + "\n";
        }
        fileReader.close();
        
        /*------------------------------------------------------------------------------------------------------------*/

        //Input String "inputWords" for coding
        String result = "";

        //For loop goes through everything in inputWords
        for (int i = 0; i < inputWords.length(); i++) {

            //Convert to inputWords to char
            char character = inputWords.charAt(i);

            if (Character.isLetter(character)) {

                char tempCharacter = (char) (Character.toUpperCase(character) + rndNumber);

                //Check if the "tempCharacter" is outside the Alphabet (UpperCase)
                if (tempCharacter > 'Z') {
                    tempCharacter -= 26;
                }

                //Check if the "tempCharacter" is outside the Alphabet (LowerCase)
                if (character >= 'a') {
                    tempCharacter += 32;
                }

                //Save "tempCharacter" back to "character"
                character = tempCharacter;
            }
            //Save in "result"
            result += character;
        }

        //Print Coded Text
        System.out.println("Here is your coded Text. \nCan you find the right Key?\n\n---------------------------------------------------\n");
        System.out.println(result);
        System.out.println("---------------------------------------------------\n\n");


        /*------------------------------------------------------------------------------------------------------------*/

        //Save coded text in new file
        File codedOutputFile = new File("/Users/emanuelleutgeb/IdeaProjects/demo/Aufgabe15_CeaserChiffre/outputText.txt");
        FileWriter fileWriter = new FileWriter(codedOutputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //Write String "result" to Textfile and save it
        fileWriter.write(result);
        fileWriter.flush();
        fileWriter.close();

        /*------------------------------------------------------------------------------------------------------------*/

        //Input coded Textfile
        File codedInputFile = new File("/Users/emanuelleutgeb/IdeaProjects/demo/Aufgabe15_CeaserChiffre/outputText.txt");
        FileReader codedFileReader = new FileReader(codedInputFile);
        BufferedReader codedBufferedReader = new BufferedReader(codedFileReader);

        //Read coded Textfile and save it to String
        ArrayList<String> codedLines = new ArrayList<>();
        String codedInputWords = "";
        String codedLine;

        while ((codedLine = codedBufferedReader.readLine()) != null) {
            codedInputWords += codedLine + "\n";
        }

        codedFileReader.close();

        /*------------------------------------------------------------------------------------------------------------*/

        //Input String "codedInputWords" for encoding
        String encodedString = "";

        //Multiple keys for Encoding
        int findKey = 2;

        //For loop goes through every key to encode it
        for (int j = 25; j >= findKey; j--) {
            encodedString = "";

            //For loop goes through everything in inputWords
            for (int k = 0; k < codedInputWords.length(); k++) {

                //Convert to inputWords to char
                char character = codedInputWords.charAt(k);

                //Check if char is letter
                if (Character.isLetter(character)) {

                    //Convert tu Uppercase and Code key from loop "findKey"
                    char tempCharacter = (char) (Character.toUpperCase(character) + j);

                    //Check if the "tempCharacter" is outside the Alphabet (UpperCase)
                    if (tempCharacter > 'Z') {
                        tempCharacter -= 26;
                    }

                    //Check if the "tempCharacter" is outside the Alphabet (LowerCase)
                    if (character >= 'a') {
                        tempCharacter += 32;
                    }

                    //Save "tempCharacter" back to "character"
                    character = tempCharacter;
                }
                //Save in "result"
                encodedString += character;
            }
            //Print Key and Text to find the right Key
            int searchingKey = (26 - j);
            System.out.println(searchingKey + "\n" + encodedString + "\n");
        }

        /*------------------------------------------------------------------------------------------------------------*/


    }
}