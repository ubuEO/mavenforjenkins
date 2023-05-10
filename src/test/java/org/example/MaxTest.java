package org.example;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MaxTest {

    @Test
    void testMaxOf3() {
        /*System.out.println("should be 1 " + testMaxOf3(1,1,1));

        System.out.println("should be 2 " + testMaxOf3(1,1,2));
        System.out.println("should be 2 " + testMaxOf3(1,2,1));
        System.out.println("should be 2 " + testMaxOf3(2,1,1));

        System.out.println("should be 2 " + testMaxOf3(1,2,2));
        System.out.println("should be 2 " + testMaxOf3(2,1,2));
        System.out.println("should be 2 " + testMaxOf3(2,2,1));

        System.out.println("should be 3 " + testMaxOf3(1,2,3));
        System.out.println("should be 3 " + testMaxOf3(1,3,2));
        System.out.println("should be 3 " + testMaxOf3(2,1,3));
        System.out.println("should be 3 " + testMaxOf3(2,3,1));
        System.out.println("should be 3 " + testMaxOf3(3,1,2));
        System.out.println("should be 3 " + testMaxOf3(3,2,1));*/

        Max m = new Max();
        assertThat(m.maxOf3(1,1,1)).isEqualTo(1);

        assertThat(m.maxOf3(1,1,2)).isEqualTo(2);
        assertThat(m.maxOf3(1,2,1)).isEqualTo(2);
        assertThat(m.maxOf3(2,1,1)).isEqualTo(2);

        assertThat(m.maxOf3(1,2,2)).isEqualTo(2);
        assertThat(m.maxOf3(2,1,2)).isEqualTo(2);
        assertThat(m.maxOf3(2,2,1)).isEqualTo(2);

        assertThat(m.maxOf3(1,2,3)).isEqualTo(3);
        assertThat(m.maxOf3(1,3,2)).isEqualTo(3);
        assertThat(m.maxOf3(2,1,3)).isEqualTo(3);
        assertThat(m.maxOf3(2,3,1)).isEqualTo(3);
        assertThat(m.maxOf3(3,1,2)).isEqualTo(3);
        assertThat(m.maxOf3(3,2,1)).isEqualTo(3);
    }


}