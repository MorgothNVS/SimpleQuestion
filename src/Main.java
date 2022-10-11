public class Main {
    public static void main(String[] args) {
        ClassInterface MyItnerface = new ClassInterface();
        ClassSearch MySearch = new ClassSearch();

        for (; ; ) {

            //ввод данных
            int[] nums = MyItnerface.ReadNums();
            int k = MyItnerface.ReadK();
            int[] answer = new int[0];

            //решение
            int choice = MyItnerface.WriteChoice();
            switch (choice)
            {
                case 1:
                    answer = MySearch.SearchWithDoubleFor(nums, k);
                    break;
                case 2:
                    answer = MySearch.SearchWithHashSet(nums, k);
                    break;
                case 3:
                    answer = MySearch.SearchWithBinary(nums, k);
                    break;
                case 4:
                    answer = MySearch.SearchWithIndex(nums, k);
                    break;
            }

            //вывод ответа
            MyItnerface.WriteNumsAndK(nums, k);
            MyItnerface.WriteFinal(answer);
        }
    }
}