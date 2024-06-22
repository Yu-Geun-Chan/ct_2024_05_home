package com.ki.level0.p120899;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};

        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                answer = new int[]{max, i};
            }
        }
        return answer;
    }
}