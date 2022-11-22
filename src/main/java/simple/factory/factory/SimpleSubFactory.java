package simple.factory.factory;


import simple.factory.subs.Sub;
import simple.factory.subs.Chicken;
import simple.factory.subs.Crab;
import simple.factory.subs.ItalianBMT;
import simple.factory.subs.Salmon;

import java.util.Scanner;

public class SimpleSubFactory {

    public Sub createSub() {
        Sub sub = null;

        System.out.println("Выберите саб:\n" +
                "Итальянский БМТ - 1\n" +
                "Куриный - 2\n" +
                "Крабовый - 3\n" +
                "С семгой - 4");

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        while (true) {
            if (operation == 1) {
                sub = new ItalianBMT();
                break;
            } else if (operation == 2) {
                sub = new Chicken();
                break;
            } else if (operation == 3) {
                sub = new Crab();
                break;
            } else if (operation == 4) {
                sub = new Salmon();
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        return sub;
    }
}
