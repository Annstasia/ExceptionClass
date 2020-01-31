package com.company;

import java.util.Scanner;

class StrangeException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    @Override
    public String getMessage() {
        return "Число \"" + number +"\" является нечетным! Ожидалось четное число.";
    }

    public StrangeException(int num) {
        number=num;
    }
}

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws StrangeException {
        try{
            System.out.println("Введите четное число:");

            int num=in.nextInt();
            if (num % 2 == 1) throw new StrangeException(num);
        }
        catch (StrangeException e){
            System.out.println(e.getMessage());

        }
    }
}

