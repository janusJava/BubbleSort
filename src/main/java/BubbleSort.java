import java.util.List;

public class BubbleSort {

    public static <T extends Comparable<T>> List<T> sort(List<T> input) throws Exception {
        if (input==null) {
            throw new Exception("Input list is null");
        }
        int lenghtOfList = input.size();
        for (int i = 0; i < lenghtOfList - 1; i++) {
            for (int j = 0; j < lenghtOfList - 1 - 1; j++) {
                if (input.get(j).compareTo(input.get(j + 1)) > 0) {
                    T maxNumber = input.get(j);
                    input.set(j, input.get(j+1));
                    input.set(j+1, maxNumber);
                }
            }
        }
        return input;
    }

}




