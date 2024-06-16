package com.ki.level0.p120818;

public class Main {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int price) {
            int a = int (price);
            if (a < 100000) {
                return a;
            }
            else if (a >= 100000) {
                return a * 0.95;
            }
            else if (a < 500000 && a >= 300000) {
                return a * 0.9;
            }
            return a * 0.85;
        }

    }

