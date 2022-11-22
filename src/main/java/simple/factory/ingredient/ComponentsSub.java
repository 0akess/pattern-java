package simple.factory.ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComponentsSub {

    Scanner scanner = new Scanner(System.in);

    public void addVegetables() {

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Капуста");
        vegetables.add("Огурец");
        vegetables.add("Лук");
        vegetables.add("Перец чили");
        vegetables.add("Помидоры");
        vegetables.add("Оливки");

        System.out.println("Какие овощи имеются");

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println((i + 1) + " " + vegetables.get(i));
        }

        while (true) {
            System.out.println("Введите номер, как поступить с овощами:\n " +
                    "1 - Добавить все \n " +
                    "2 - Убрать определенные");
            int operation = scanner.nextInt();
            List<String> localVegetables = vegetables;
            if (operation == 1) {
                for (int i = 0; i < vegetables.size(); i++) {
                    System.out.println("Добавлено: " + vegetables.get(i));
                }
                break;
            } else if (operation == 2) {
                while (true) {
                    System.out.println("Что убрать, выберите число. Введите 0, если все остальное устраивает");
                    for (int i = 0; i < vegetables.size(); i++) {
                        System.out.println((i + 1) + " " + localVegetables.get(i));
                    }
                    int removeVegetables = scanner.nextInt();
                    if (removeVegetables < localVegetables.size() && removeVegetables > 0) {
                        localVegetables.remove(removeVegetables - 1);
                    } else if (removeVegetables == 0) {
                        System.out.println("Хорошо, положили овощи:");
                        for (int i = 0; i < vegetables.size(); i++) {
                            System.out.println((i + 1) + " " + localVegetables.get(i));
                        }
                        break;
                    } else {
                        System.out.println("Введите корректное значение");
                    }
                }
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
    }

    public void addCheese() {

        System.out.println("Добавляем сыр? \n Да - 1 \n Нет - 2");
        int addCheese = scanner.nextInt();

        while (true) {
            if (addCheese == 1) {
                System.out.println("Добавили сыр");
                break;
            } else if (addCheese == 2) {
                System.out.println("Без сыра");
                break;
            } else System.out.println("Введите корректное значение");
        }

    }

    public void addSauce() {

        List<String> sauces = new ArrayList<>();
        sauces.add("Чили");
        sauces.add("Сладкий лук");
        sauces.add("Майонез");
        sauces.add("Кетчуп");
        sauces.add("1000 островов");
        sauces.add("Кисло-сладкий");

        System.out.println("Какие соусы имеются");

        for (int i = 0; i < sauces.size(); i++) {
            System.out.println((i + 1) + " " + sauces.get(i));
        }

        while (true) {
            System.out.println("Выберите операцию: 1 - добавляем соус, 2 - без соуса");
            int operation = scanner.nextInt();
            List<String> localAddSauces = new ArrayList<>();
            List<String> localRemoveSauces = sauces;
            if (operation == 1) {
                while (true) {
                    if (localAddSauces.size() >= 3) {
                        System.out.println("Готово, соусы добавлены!\n" +
                                "У нас можно выбрать только 3 соуса.\n" +
                                "Мы бережем ваши рецепторы <3");
                        for (int i = 0; i < localAddSauces.size(); i++) {
                            System.out.println((i + 1) + " " + localAddSauces.get(i));
                        }
                        break;
                    }
                    System.out.println("Какой добавить, выберите число. Введите 0, если все остальное устраивает");
                    for (int i = 0; i < localRemoveSauces.size(); i++) {
                        System.out.println((i + 1) + " " + localRemoveSauces.get(i));
                    }
                    int removeVegetables = scanner.nextInt();
                    if (removeVegetables <= localRemoveSauces.size() && removeVegetables > 0) {
                        localAddSauces.add(sauces.get(removeVegetables - 1));
                        localRemoveSauces.remove(removeVegetables - 1);
                    } else if (removeVegetables == 0) {
                        System.out.println("Хорошо, добавили:");
                        for (int i = 0; i < localAddSauces.size(); i++) {
                            System.out.println((i + 1) + " " + localAddSauces.get(i));
                        }
                        break;
                    } else {
                        System.out.println("Введите корректное значение");
                    }
                }
                break;
            } else if (operation == 2) {
                System.out.println("Без соуса, так без соуса");
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
    }

    public void addSalt() {
        while (true) {
            System.out.println("Добавить соль? Выберите 1 - добавляем, 2 - значит без соли");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println("Посолили!");
                break;
            } else if (operation == 2) {
                System.out.println("Без соли, так без соли. Рыба и так соленая :)");
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
    }
}
