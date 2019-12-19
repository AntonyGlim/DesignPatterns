package gof.behavioral.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        ClientOperation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException | IOException e) {
                System.out.println("Пожалуйста, выберите из предложенного списка");
            }
        } while (operation != ClientOperation.EXIT);
    }

    public static ClientOperation askOperation() throws ArrayIndexOutOfBoundsException, IOException {
        System.out.println(              "");
        System.out.println(              "+------------------------+");
        System.out.println(              "| Выберите операцию:     |");
        System.out.println(String.format("|\t %d - добавить файл   |", ClientOperation.ADD.ordinal()));
        System.out.println(String.format("|\t %d - удалить файл    |", ClientOperation.REMOVE.ordinal()));
        System.out.println(String.format("|\t %d - обновить файл   |", ClientOperation.REFRESH.ordinal()));
        System.out.println(String.format("|\t %d - информация      |", ClientOperation.INFO.ordinal()));
        System.out.println(String.format("|\t %d - выход           |", ClientOperation.EXIT.ordinal()));
        System.out.println(              "+------------------------+");
        return ClientOperation.values()[readInt()];
    }

    public static int readInt() throws IOException {
        try {
            return Integer.parseInt(bis.readLine().trim());
        } catch (NumberFormatException e){
            System.out.println("Не корректный ввод");
            throw new IOException();
        }
    }

}
