package simpletictactoe;

import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.nextLine();

        char[][] arr = new char[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int vvodIndex = j + i * 3;
                arr[i][j] = vvod.charAt(vvodIndex);
            }
        }

        System.out.println("---------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("| " + arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " |");
        }
        System.out.println("---------");

        while (true) {
            System.out.println("Enter coordinates");
            String printX = scanner.nextLine();
            int coord1 = (int)printX.charAt(0) - 49;
            int coord2 = (int)printX.charAt(2) - 49;

            if (printX.length() != 3) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (printX.charAt(0) - 49 < 0 || printX.charAt(0) - 49 > 2 || printX.charAt(2) - 49 < 0 || printX.charAt(2) - 49 > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if (arr[coord1][coord2] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }
            arr[coord1][coord2] = 'X';
            break;
        }

        System.out.println("---------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("| " + arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " |");
        }
        System.out.println("---------");
    }
}
