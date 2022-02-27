package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;

class Task4 {
    //Create array with odd numbers
    int[] oddNumberArrayCreator(int size) {
        int sizeOfOddArrayWithNoZeros = 0;
        int[] oddArrayWithNoZeros;
        int[] oddArray = new int[size];

        //Сначала заполним нулями
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                oddArray[i] = i;
                sizeOfOddArrayWithNoZeros++;
            }
        }

        //Создадим еще один массив чтобы не возвращать массив с нулями
        oddArrayWithNoZeros = new int[sizeOfOddArrayWithNoZeros];
        for (int i = 0, j = 0; i < size; i++) {
            if (oddArray[i] != 0) {
            j++;
            oddArrayWithNoZeros[j] = oddArray[i];
            }
        }
        return oddArrayWithNoZeros;
    }

    //Array in console in ordinal order
    static void arrayOnDisplay(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i] + " ");
        }
        System.out.println(builder);
    }

    //Array in console in reverse order
    static void arrayOnDisplayReversed(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i] + " ");
        }
        System.out.println(builder);
    }
}
