package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;

class Task6 {
    //Create random numbers array -1 0 1 of user size
    int[] randomNumberArrayCreator(int size) {
        int numbersSpread = 1 + 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random() * numbersSpread - 1);
        }
        return arr;
    }

    //Будет так некрасиво потому что никаких коллекций мы не знаем
    void mostFrequentElementInArray(int[] array) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int element : array) {
            switch (element) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case -1:
                    count2++;
                    break;
            }
        }

        if (count0 > count1 && count0 > count2) {
            System.out.println("0-й больше ");
        } else if (count1 > count0 && count1 > count2) {
            System.out.println("1-ц больше ");
        } else if (count2 > count0 && count2 > count1) {
            System.out.println("-1-ц больше ");
        }
    }

}
