package com.ki.level0.p120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


//        System.out.println(new Solution().solution(2, 3)); // -1
//        System.out.println(new Solution().solution(11, 11)); // 1
//        System.out.println(new Solution().solution(7, 99)); // -1

public class Tests {

    @Test
    @DisplayName("2랑 3을 넣으면 -1이 나와야해")
    void t1() {
        assertThat(new Solution().solution(2, 3)).isEqualTo(-1);
    }

    @Test
    @DisplayName("11, 11 => 1")
    void t2() {
        assertThat(new Solution().solution(11, 11)).isEqualTo(1);
    }

    @Test
    @DisplayName("7, 99 => -1")
    void t3() {
        assertThat(new Solution().solution(7, 99)).isEqualTo(-1);
    }
}
