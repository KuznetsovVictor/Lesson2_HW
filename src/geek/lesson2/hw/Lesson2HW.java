package geek.lesson2.hw;

public class Lesson2HW {
    /*1) Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    private static void convertingArray(int[] array1){
        for(int i = 0; i < array1.length; i++){
            if(array1[i] == 1){
                array1[i] = 0;
            }else{ array1[i]=1; }
            System.out.print(array1[i] + " ");
        }
    }

    /* 2) Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22 */
    private static void fillingArray(int[] array2){
        for (int i = 0; i < array2.length; i++){
            array2[i] = i * 3 + 1;
            System.out.print(array2[i] + " ");
        }
    }

    /* 3) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2 */
    private static void incArray(int[] array3 ){
        for(int i =0; i < array3.length; i++){
            if(array3[i] < 6){
                array3[i] = array3[i] * 2;
            }
            System.out.print(array3[i] + " ");
        }
    }

    /* 4) Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента. */
    private static void minMaxArray(int [] array4){
        int minNumber = array4[0];
        int maxNumber = array4[0];
        for (int i=0; i < array4.length;i++){
            if(array4[i] >= maxNumber){
                maxNumber = array4[i];
            }
            if(array4[i] <= minNumber){
                minNumber = array4[i];
            }
        }
        System.out.println("Минимальный элемент в массиве: " + minNumber);
        System.out.println("Максимальное элемент в массиве: " + maxNumber + "\n");
    }

   /* 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);*/
    private static void diogonalArray(int[][] array5){
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0, j2 = array5[i].length; j < array5[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) array5[i][j] = 1;
                System.out.print(array5[i][j] + " ");
            }   System.out.println(" ");
        }        System.out.println(" ");
    }

 /*   6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.*/
    private static boolean comparisonItemArray(int[] array6) {
        int Sum1 = 0, Sum2 = 0;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < i; j++) {
                Sum1 += array6[j];
            }
            for (int j = i; j < array6.length; j++) {
                Sum2 += array6[j];
            }
            }
        return Sum1 == Sum2;
    }

    /* 7-8 *** Написать метод, которому на вход подаётся одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
     */
    private static void offsetArray(int[] array7, int offset){
        System.out.println("Заданный массив:");
        for (int i : array7) System.out.print(i + " ");
        System.out.println("\n");

        if (offset > 0) {
            for (int x = 0; x < offset; x++) {
                int buffer = array7[array7.length - 1];
                if (array7.length - 1 >= 0){System.arraycopy(array7, 0, array7, 1, array7.length - 1);}
                array7[0] = buffer;
                }
        }
        if (offset < 0) {
            for (int x = 0; x > offset; x--) {
                int buffer = array7[0];
                System.arraycopy(array7, 1, array7, 0, array7.length - 1);
                array7[array7.length - 1] = buffer;
            }
        }
        System.out.println("Смещенный массив:");
        for (int i : array7) System.out.print(i + " ");
    }



    public static void main(String[] args) {

        System.out.println("Задание № 1:");
        int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        convertingArray(arr1);
        System.out.println("\n");

       System.out.println("Задание № 2:");
       fillingArray(new int[8]);
       System.out.println("\n");

       System.out.println("Задание № 3:");
       int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       incArray(arr);
       System.out.println("\n");

        System.out.println("Задание № 4:");
        int [] array4 = {-1,3,0,-2,-8};
        minMaxArray(array4);

        System.out.println("Задание № 5:");
        diogonalArray( new int[5][5]);

        System.out.println("Задание № 6:");
        System.out.println(comparisonItemArray(new int[]{10, 1, 2, 3, 4}));

        System.out.println("Задание № 7-8:");
        int [] array7 = {3,5,12,34,44,21};
        offsetArray(array7,-3);

      }
}
