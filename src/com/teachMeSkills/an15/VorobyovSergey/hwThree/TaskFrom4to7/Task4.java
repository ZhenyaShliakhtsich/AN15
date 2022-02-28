package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;
//лучше поделить на 2 весь массив
class Task4 {
    //Create array with odd numbers
    int[] oddNumberArrayCreator(int size) {
        int sizeOfOddArrayWithNoZeros = size / 2;
        int[] oddArray = new int[sizeOfOddArrayWithNoZeros];

        oddArray[0] = 2;
        for (int i = 1; i < sizeOfOddArrayWithNoZeros; i++) {
            oddArray[i] = oddArray[i - 1] + 2;
        }
        return oddArray;
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
