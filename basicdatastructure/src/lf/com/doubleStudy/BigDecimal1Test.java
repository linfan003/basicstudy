package lf.com.doubleStudy;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author linfan
 * @Date 2020/11/30 19:53
 * @Version 1.0
 */
public class BigDecimal1Test {
    @Test
    /**
     * 比较
     */
    public void decimal1() {
        BigDecimal bigDecimal1 = new BigDecimal("0.00000000000000000000000000005662");
        System.out.println(bigDecimal1);

        BigDecimal bigDecimal2 = new BigDecimal("0.00000000000000000000000000005661");
        System.out.println(bigDecimal2);

        System.out.println(bigDecimal1.compareTo(bigDecimal2));

    }

    @Test
    /**
     * 比较
     */
    public void decimal2() {
        BigDecimal bigDecimal1 = new BigDecimal(0.00000000000000000000000000005662);
        System.out.println(bigDecimal1);

        BigDecimal bigDecimal2 = new BigDecimal(0.00000000000000000000000000005661);
        System.out.println(bigDecimal2);

        System.out.println(bigDecimal1.compareTo(bigDecimal2));

    }
}
