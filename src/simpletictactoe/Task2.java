package simpletictactoe;

import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.next();
        boolean winx = false;
        boolean win0 = false;
        boolean Gamenotfinished = false;
        boolean end = false;
        boolean impossible = false;
        System.out.println(vvod);

        char[][] arr = new char [3][3];
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
    }
}