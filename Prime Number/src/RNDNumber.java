import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class RNDNumber {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {

            int r = rnd.nextInt(21) +2;
            System.out.println(r);
        }
/*
        //CODEN
        int i = 'A';
        String inputWords = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //Convert to inputWords to char
        char character = inputWords.charAt(i);

        //Convert char to ASCII Code "A = 65 to Z = 90" and "a = 97 to z = 122"
        if ((int) character >= 'A' && (int) character <= 'Z' || (int) character >= 'a' && (int) character <= 'z') {

            //Code key
            int codedAscii = (int) character + 26;//rndNumber; //rndNumber is the Key

            //ASCII Code mixing through hole alphabet
            if (codedAscii > 'z') {
                codedAscii = '@' + (codedAscii - 'z');
                //codedAscii = codedAscii - 'z' + 'A'; //'@' = A
            } else if (codedAscii > 'Z' && codedAscii <= 'a') {
                codedAscii = '`' + (codedAscii - 'Z');
                //codedAscii = codedAscii - 'Z' + 'a'; //'`' = a
            }

            //ENCODEN
            int j = 'A';
            String codedInputWords = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            //Convert to inputWords to char
            character = codedInputWords.charAt(j);

            //Convert char to ASCII Code "A = 65 to Z = 90" and "a = 97 to z = 122"
            if ((int) character >= 'A' && (int) character <= 'Z' || (int) character >= 'a' && (int) character <= 'z') {

                //Code key from "findKey"
                int encodedAscii = (int) character - 26;//i; //i = findKey

                //ASCII encode mixing through hole alphabet
                if (encodedAscii < 'A') {
                    encodedAscii = 'z' + (encodedAscii - '@');
                    //encodedAscii = 'z' + (encodedAscii - 'A'); //'@' = A
                } else if (encodedAscii > 'Z' && encodedAscii < 'a') {
                    encodedAscii = 'Z' + (encodedAscii - '`'); //'`' = a
                    //ALT ALT !!!!encodedAscii = encodedAscii - 97 + 90;
                    //encodedAscii = 'Z' + (encodedAscii - 'a'); //'`' = a
                }


        }
*/
    }
}
