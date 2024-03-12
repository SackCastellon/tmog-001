package org.tfoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        var result = solution.twoSum(new int[] {2, 7, 11, 15}, 9);
        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }

    @Test
    void example2() {
        var result = solution.twoSum(new int[] {3, 2, 4}, 6);
        assertThat(result).containsExactlyInAnyOrder(1, 2);
    }

    @Test
    void example3() {
        var result = solution.twoSum(new int[] {3, 3}, 6);
        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }
}
