package com.ki.level0.p120811;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


//        System.out.println(new Solution().solution(2, 3)); // -1
//        System.out.println(new Solution().solution(11, 11)); // 1
//        System.out.println(new Solution().solution(7, 99)); // -1

public class Tests {

    @Test
    @DisplayName("2, 3 => 2")
    void t1() {
        assertThat(new Solution().solution(new int[]{2, 3})).isEqualTo(2);
    }

    @Test
    @DisplayName("11, 11 => 11")
    void t2() {
        assertThat(new Solution().solution(new int[]{11, 11})).isEqualTo(11);
    }

    @Test
    @DisplayName("7, 99 => 7")
    void t3() {
        assertThat(new Solution().solution(new int[]{7, 99})).isEqualTo(7);
    }

}
