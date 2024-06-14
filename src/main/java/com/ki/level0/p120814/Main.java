package com.ki.level0.p120814;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        if (n/7 <= 1) {
            return 1;
        }
        else if (1 < n/7 && n/7 < 2) {
            return 2;
        }
        else if (2 < n/7 && n/7 < 3) {
            return 3;
        }
        return 4;
    }
}