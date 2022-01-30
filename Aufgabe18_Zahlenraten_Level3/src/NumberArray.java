import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class NumberArray {

    public static ArrayList numberArray(int numberRange, int firstRoundtoArray){

        ArrayList<Integer> selectedNumber = numberArrayFixed(numberRange, firstRoundtoArray);

        selectedNumber.size();
        return (selectedNumber);
    }

    public static ArrayList numberArrayFixed(int numberRange, int firstRoundtoArray){
        ArrayList<Integer> fixedArrayRange;
        if (firstRoundtoArray == 0) {
            ArrayList<Integer> fixedArrayRange = new ArrayList<>(numberRange);
            for (int i = 0; i < numberRange; i++) {
                fixedArrayRange.add(i);
            }
        }

        return (fixedArrayRange);
    }
}
