/*9. Шахматная доска
        Создать программу для раскраски шахматной доски с помощью цикла.
        Создать двумерный массив String'ов 8х8. С помощью циклов задать
        элементам циклам значения B(Black) или W(White). Результат работы
        программы:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W*/
public class Task9 {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}