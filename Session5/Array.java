package Session5;

public class Array {

    public static void main(String[] args) {

        int arr[][] = new int[5][3];

        System.out.print(arr[0].length);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = (i+1) * (j+1);

            }

        }

        System.out.println("\n");

        for (var a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }

    }

}
