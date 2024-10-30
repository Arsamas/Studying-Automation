package com.automation.exception_task;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Напиши метод, который делит два числа, взятые из массива по индексам, указанным пользователем. Программа должна обрабатывать возможные
ошибки, такие как деление на ноль и выход за пределы массива. В конце программа всегда должна выводить сообщение, что выполнение завершено,
независимо от результата деления.
Требования:
Создайте массив из нескольких чисел.
Запрашивайте у пользователя два индекса для чисел, которые он хочет поделить.
Используйте try/catch для обработки исключений:
ArithmeticException — возникает, если происходит деление на ноль.
ArrayIndexOutOfBoundsException — возникает, если пользователь вводит индекс, выходящий за пределы массива.
В блоке finally выведите сообщение "Операция завершена."
 */

public class TaskException {
    public static void main(String[] args) throws IOException {
        int[] arr = {0, 100, 200, 300, 400, 500, 600};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int numberOne = Integer.parseInt(s1);
        int numberTwo = Integer.parseInt(s2);

        try {
            System.out.println("Result is: " + arr[numberOne]/arr[numberTwo]);
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0");
            throw ex;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Число за пределами массива");
            throw ex;
        }
        finally {
            System.out.println("Операция завершена");
        }
    }
}
