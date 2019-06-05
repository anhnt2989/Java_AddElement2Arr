import java.util.Scanner;

public class Java_AddElement2Arr {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Must add 1 more '0' element to array than your expectation to work correctly!");
        System.out.println("Enter a size:");
        size = scanner.nextInt();
        array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Array is: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println("\n"+"Enter a element to add: ");
        int x = scanner.nextInt();
        System.out.println("Enter a position to add following element to: ");
        int index = scanner.nextInt();

        if (index >= array.length || index <= 1) {
            System.out.println("Couldn't add element to array!");
        } else {
            if (array.length - 1 - index >= 0)
                System.arraycopy(array, index, array, index + 1, array.length - 1 - index);
            array[index] = x;
        }
        System.out.println("Array after added is: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
