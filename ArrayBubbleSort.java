package javaobject;

public class ArrayBubbleSort extends ArraySort {

    private static int cmpr;
    private static int swp;
  protected static final IntUtil u = new IntUtil();
    

    
    
    public static void bubble_srt(int array[], boolean ascend) {
        int length = array.length;
        int a;
        cmpr = 0;
        swp = 0;
        for (int j = length; j >= 0; j--) {
            for (int i = 0; i < length - 1; i++) {
                a = i + 1;
                
                cmpr++;
                if (array[i] > array[a]) {
                    swp++;
                   swapNumbers(i, a, array);
                 
                }
            }
            if (ascend) {
                printNumbers(array);
            }
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            str.append(input[i]).append(", ");
        }
        if (input.length > 0) {
            str.deleteCharAt(str.length() - 2);
        }
        System.out.println(str + "\n");
    }

    public static void main(String[] args) {
       
        ArraySort a = new ArrayBubbleSort();

        a.testBench();

    }

    @Override
    protected void sort(boolean ascend) {
        bubble_srt(a, ascend);
       
        numCompare=cmpr;
        numSwap=swp;
        
    }

}
