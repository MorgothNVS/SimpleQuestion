import java.util.Scanner;
public class ClassInterface {

    //вывод вариантов решения
    public int WriteChoice() {
        System.out.println("Выберите способ решения нажав цифру соответствующую выбору");
        System.out.println("1 - Простой поиск перебором через двойной цикл");
        System.out.println("2 - Поиск через Хэшсет");
        System.out.println("3 - Бинарный поиск (только для отсортированного массива");
        System.out.println("4 - Поиск через 2 указателя (только для отсортированного массива");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        return choice;
    }

    //вывод финального ответа
    public void WriteFinal(int[] answer) {
        System.out.print("Ответ: ");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }

    //вывод массива и числа k
    public void WriteNumsAndK(int[] nums, int k) {
        System.out.print("Исходный массив: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Число k: " + k);
    }

    //ввод массива чисел
    public int[] ReadNums()
    {
        System.out.print("Введите массив чисел через пробел, после завершение ввода нажмите <Enter>: ");
        Scanner in = new Scanner(System.in);
        String numsText = in.nextLine();
        int[] nums = StringToNums(numsText);
        return nums;
    }

    //ввод числа k
    public int ReadK() {
        System.out.print("Введите число для поиска в массиве двух чисел в сумме составляющих это число, после завершение ввода нажмите <Enter>: ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        return k;
    }

    //преобразование введенной строки в массив чисел
    public int[] StringToNums(String numsText) {
        String strNums[] = numsText.split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        return nums;
    }
}
