/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
 * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

package lesson;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(settingNumber());
    }

    public static float settingNumber() {
        Scanner in = new Scanner(System.in);
        float result = 0;
        try {
            System.out.println("Введите число");
            String number = in.nextLine();
            result = Float.parseFloat(number);
        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат числа, попробуйте снова");
            settingNumber();
        }
        return result;
    }
}
