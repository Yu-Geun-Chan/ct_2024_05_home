package com.ki.level0.p120813;

public class Main {
    public static void main(String[] args) {


    }

}

class Solution {
    public int[] solution(int n) {
        int[] array = new int[(n + 1) / 2];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a += 2;
        }
        return array;
    }
}


