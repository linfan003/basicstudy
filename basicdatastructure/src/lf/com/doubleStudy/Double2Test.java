package lf.com.doubleStudy;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author linfan
 * @Date 2020/11/29 10:23
 * @Version 1.0
 */
public class Double2Test {
    @Test
    public void double_decimal() {
        double double1 = 0.222;
        BigDecimal bigDecimal1 = new BigDecimal(double1);
        System.out.println(bigDecimal1);
    }

}
