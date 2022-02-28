package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;

class Task7 {
    private String str;

    public Task7(String str) {
        this.str = str;
    }

    boolean isPalindrome() {
        char[] symbolsArray = str.toCharArray();
        int length = symbolsArray.length - 1;
        for (int i = 0; i <= length; i++) {
            if (symbolsArray[i] != symbolsArray[length - i]) {
                return false;
            }
        }
        return true;
    }
}
