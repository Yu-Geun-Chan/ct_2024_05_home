package com.ki.pccp.no1;

import com.ki.pccp.no1.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


//        System.out.println(new Solution().solution(2, 3)); // -1
//        System.out.println(new Solution().solution(11, 11)); // 1
//        System.out.println(new Solution().solution(7, 99)); // -1

public class Tests {

    @Test
    @DisplayName("34:33, 13:00, 00:55, 02:55, [next, prev] => 13:00")
    void t1() {
        assertThat(new Solution().solution("34:33", "13:00", "00:55", "02:55",
                new String[]{"next", "prev"})).isEqualTo("13:00");
    }

    @Test
    @DisplayName("10:55, 00:05, 00:15, 06:55, [prev, next, next] =>	06:55")
    void t2() {
        assertThat(new Solution().solution("10:55", "00:05", "00:15", "06:55",
                new String[]{"prev", "next", "next"})).isEqualTo("06:55");
    }

    @Test
    @DisplayName("01:30, 00:40, 00:15, 00:25, [\"next\", \"next\", \"prev\", \"next\", \"prev\", \"prev\"] => 00:40")
    void t3() {
        assertThat(new Solution().solution("01:30", "00:40", "00:15", "00:25",
                new String[]{"next", "next", "prev", "next", "prev", "prev"})).isEqualTo("00:40");
    }
}

