package com.ki.level0.p120811;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


    }

}

class Solution {
    public int solution(int[] array) {
        int a;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            if (i == (array.length )/ 2) {
                return array[i];
            }
        }

        return 0;
    }

}


