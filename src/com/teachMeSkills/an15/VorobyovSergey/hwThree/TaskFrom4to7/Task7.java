package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;

//лучше остановиться на середине
class Task7 {
    private String str;

    public Task7(String str) {
        this.str = str;
    }

    boolean isPalindrome() {
        char[] symbolsArray = str.toCharArray();
        int length = symbolsArray.length;
        for (int i = 0; i < length; i++) {
            System.out.println(symbolsArray[i] + " " + symbolsArray[length - i - 1]);
            if (symbolsArray[i] != symbolsArray[length - i - 1]) {
                return false;
            } else if (i == (length - i - 1)) {
                break;  //stop in the middle
            }
        }
        return true;
    }
}
