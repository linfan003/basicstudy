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
    /**
     * 精度失效的解决办法，采用bigdecimal的数据类型
     */
    public void double_decimal() {
        double double1 = 0.000000000000000000000000000000000222;
        BigDecimal bigDecimal1 = new BigDecimal(double1);
        System.out.println(bigDecimal1);

        BigDecimal bigDecimal2 = new BigDecimal("0.00000000000000000000000000005661");
        System.out.println(bigDecimal2);

    }


}
