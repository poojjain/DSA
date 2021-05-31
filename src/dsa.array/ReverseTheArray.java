package dsa.array;

// this is the problem to reverse and array in log n time and no extra space
class ReverseTheArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            array[start] = array[start]+array[end];
            array[end] = array[start] - array[end];
            array[start] = array[start] - array[end];
            start++;
            end--;
        }
        for(int a : array) {
            System.out.println(a);
        }
    }
}