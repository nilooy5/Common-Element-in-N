import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        System.out.println("TEST PERFORMED by Munira Tabassum");
        System.out.println("TEST for Common Elements between two Arrays in N time");

        int[] arr1 = { 53, 39, 84, 105, 42, 96 };
        int[] arr2 = { 96, 33, 105, 47, 75, 35, 13, 39};
        PrintCommons(arr1,arr2);
    }
    private static void PrintCommons(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int a = 0;
        int b = 0;
        while ((a < arr1.length) && (b < arr2.length)) {
            if (arr2[b] > arr1[a]) a++;
            else if (arr2[b] < arr1[a]) b++;
            else {
                System.out.println(arr2[b]);
                a++;
                b++;
            }
        }
    }
}
