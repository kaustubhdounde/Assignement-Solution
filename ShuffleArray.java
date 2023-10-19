public class ShuffleArray {
    public static void main() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);
        System.debug('Shuffled array: ' + arr);
    }

    public static void shuffleArray(Integer[] arr) {
        for (Integer i = arr.size() - 1; i > 0; i--) {
            Integer j = (Integer)Math.floor(Math.random() * (i + 1));
            swap(arr, i, j);
        }
    }

    public static void swap(Integer[] arr, Integer i, Integer j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
