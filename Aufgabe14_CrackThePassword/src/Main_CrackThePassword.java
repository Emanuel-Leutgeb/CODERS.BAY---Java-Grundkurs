import java.util.Random;

public class Main_CrackThePassword {
    public static void main(String[] args) throws InterruptedException {
        Random rndNumber = new Random();

        char[] avialable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ<>,;.:-_#'+*´`?=)(/&%$§!°^1234567890üöäÜÖÄ@€".toCharArray();

        String passwordRandom = "";
        System.out.println("Hello! Let's try to find out your password!");

        System.out.println();
        for (int i = 1; i <= 4; i++) {
            passwordRandom += avialable[rndNumber.nextInt(avialable.length)];
        }

        System.out.println("Your password is ****.");

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < avialable.length; i++) {
            for (int j = 0; j < avialable.length; j++) {
                for (int k = 0; k < avialable.length; k++) {
                    for (int l = 0; l < avialable.length; l++) {

                        String passwordFind = "" + avialable[i] + avialable[j] + avialable[k] + avialable[l];

                        if (passwordFind.equals(passwordRandom)) {
                            System.out.println("Correct password: " + passwordFind);
                            break;
                        }
                    }
                }
            }
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("Your password is: " + passwordRandom);
        System.out.println("Time to crack your password: " + (timeEnd - timeStart) + " Milliseconds.");

        //Crack with while Schleife (Glücksprinzip)
/*
        String passwordFind = "";
        long timeStart = System.currentTimeMillis();
        while (!passwordFind.equals(passwordRandom)) {
            passwordFind = "";
            for (int j = 1; j <= 4; j++) {
                code = avialable[rnd.nextInt(avialable.length)];
                passwordFind += code;
            }
            if (!passwordFind.equals(passwordRandom)){
                System.out.println("No correct password: " + passwordFind);
            }

        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Your password is: " + passwordFind + " " + passwordRandom);
        System.out.println("Time to crack your password: " + (timeEnd - timeStart) + " Milliseconds.");
*/
    }
}