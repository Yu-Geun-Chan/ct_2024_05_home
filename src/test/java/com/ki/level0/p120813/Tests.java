package com.ki.level0.p120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


//        System.out.println(new Solution().solution(2, 3)); // -1
//        System.out.println(new Solution().solution(11, 11)); // 1
//        System.out.println(new Solution().solution(7, 99)); // -1

public class Tests {

    @Test
    @DisplayName("10")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(new int[]{1, 3, 5, 7, 9});
    }

    @Test
    @DisplayName("15")
    void t2() {
        assertThat(new Solution().solution(10)).isEqualTo(new int[]{1, 3, 5, 7, 9, 11, 13, 15});
    }
}
