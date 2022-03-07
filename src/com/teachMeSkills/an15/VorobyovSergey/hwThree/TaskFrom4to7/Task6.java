package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;

class Task6 {
    void OnlyOneMethod() {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        int size = 11;
        int numbersSpread = 1 + 1;
        int[] arr = new int[size];

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random() * numbersSpread - 1);
            builder.append(arr[i]).append(" ");
            switch (arr[i]) {
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

        System.out.println(builder);

        if (count0 == count1 || count0 == count2 || count1 == count2) {
        } else {
            if (count0 > count1 && count0 > count2) {
                System.out.println("0-й больше ");
            } else if (count1 > count0 && count1 > count2) {
                System.out.println("1-ц больше ");
            } else if (count2 > count0 && count2 > count1) {
                System.out.println("-1-ц больше ");
            }
        }
    }
}

