public class DZ3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] arr = new int[100];
        int[] arr1 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        changeZeroesAnd0nes(array);
        fillArrayWithSequence(arr);
        modifierForArrayes(arr1);
        createSquareArray(4);
        retLenArr(5,10);
    }

    public static void changeZeroesAnd0nes(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] == 0) ? 1 : 0;

        }
    }
    public static void fillArrayWithSequence(int[] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (i + 1);
        }
    }
    public static void modifierForArrayes(int[] arr){
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < 6)
                arr[i] *= 2; {
                }
    }
    public static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println(); {

            }
            }
        }
    public static int[] retLenArr (int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;

}
}

