import java.util.Arrays;

public class Selection_Sort {
    public void SelectionSort() {
        int[] arr = {11, 4, 62, 8, 93};
        System.out.println("Selection Sort");

        System.out.println("Before Sorting");

        Arrays.stream(arr).forEach(System.out::println);


        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }


        System.out.println("After Sorting");

        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void main(String[] args)
    {
        Selection_Sort s=new Selection_Sort();
        s.SelectionSort();
    }
}
