package com.ki.level0.p120899;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    int[] a = {1, 8, 3};
    void t1() {
        assertThat(new Solution().solution(a)).isEqualTo((new int[]{8, 1}));
    }

    @Test
    @DisplayName("[9, 10, 11, 8] => [11, 2]")
    void t2() {
        assertThat(new Solution().solution(new int[]{9, 10, 11, 8})).isEqualTo((new int[]{11, 2}));
    }
}

