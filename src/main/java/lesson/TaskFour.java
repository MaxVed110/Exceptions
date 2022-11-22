/**
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку. Пользователю
 * должно показаться сообщение, что пустые строки вводить нельзя.
 */

package lesson;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println(settingNumber());
    }

    public static float settingNumber() throws RuntimeException {
        Scanner in = new Scanner(System.in);
        float result = 0;
        try {
            System.out.println("Введите число");
            String number = in.nextLine();
            System.out.println(number);
            if(number.isEmpty()){
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
            result = Float.parseFloat(number);
        } catch (NullPointerException e) {
            System.out.println("Пустые строки вводить нельзя");
            settingNumber();
        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат числа, попробуйте снова");
            settingNumber();
        }
        return result;
    }
}
