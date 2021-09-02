package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static final char EMPTY_CELL_SYMBOL = '_';
    static int size =5;
    public static void start() {

        char[][] field = {
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL}

        };

        drawField(field);
        do {
            playerMove(field);
            drawField(field);
            if (isWin(field, 'X', size)) {
                System.out.println("You are winner!");
                break;
            }
            if(isDraw(field)) {
                System.out.println("This is draw!");
                break;
            }
            computerMove(field);
            drawField(field);
            if (isWin(field, '0', size)) {
                System.out.println("You are looser!");
                break;
            }
            if(isDraw(field)) {
                System.out.println("This is draw!");
                break;
            }
        }while (true);


    }
    static boolean isDraw(char[][] field) {
        for(int v = 0; v < field.length; v++) {
            for (int h = 0; h < field.length; h++) {
                if(isEmptyCell(field, v, h)) {
                    return false;
                }

            }
        } return true;
    }
    //Поиск занятых ячеек
    static boolean isNotEmptyCell(char[][] field,int v, int h){
        return field[v][h] != EMPTY_CELL_SYMBOL;
    }
    //Поиск пустых ячеек
    static boolean isEmptyCell(char[][] field, int v, int h) {
        return !isNotEmptyCell(field, v, h);
    }
    static boolean isWin(char[][] field, char sign, int size) {
        return (isWinHorizontal(field, sign) || isWinVertical(field, sign) || isWinDiagonal(field, sign) || isWinDiagonal2(field, sign, size));
    }
    static boolean isWinHorizontal(char[][] field, char sign) {
        //horizontal
        for (int i = 0; i < field.length; i++) {
            boolean result = true;
            for (int j = 0; j < field.length; j++) {
                if(field[i][j] != sign) {
                    result = false;
                    break;
                }
            }
            if(result) {
                return true;
            }
        }
        return false;
    }
    static boolean isWinVertical(char[][] field, char sign) {
        for (int i = 0; i < field.length; i++) {
            boolean result = true;
            for (int j = 0; j < field.length; j++) {
                if(field[j][i] != sign) {
                    result = false;
                    break;
                }
            }
            if(result) {
                return true;
            }
        }
        return false;
    }
    static boolean isWinDiagonal(char[][] field, char sign) {
        int res = 0 ;
        for (int i = 0; i < field.length; i++) {
            if(field[i][i] == sign) {
                res++;
            }
        } boolean result = (res == field.length);
        return result;
    }
    static boolean isWinDiagonal2(char[][] field, char sign, int size) {
        int res = 0;
        for (int i = 0; i < field.length; i++) {
            int j = (size - (i + 1));
            if(field[i][j] == sign) {
                res++;
            }
        } boolean result = (res == field.length);
        return  result;
    }
    static void playerMove(char[][] field) {
        int v, h;
        do {
            v = getCoordinate(field, 'v');
            h = getCoordinate(field, 'h');
        } while (isNotEmptyCell(field, v ,h));
        field[v][h] = 'X';
    }
    static void computerMove(char[][] field) {
        int v, h;
        do {
            v = generateRandom(size);
            h = generateRandom(size);
        } while (isNotEmptyCell(field, v, h));
        field[v][h] = '0';
    }

    static int generateRandom(int size) {
        Random rand = new Random();
        return rand.nextInt(size);

    }
    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int getCoordinate(char[][] field, char coordinateName) {
        Scanner scan = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Please enter coordinate %s %n", coordinateName);
            coordinate = scan.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= field.length);
        return coordinate;
    }
}
