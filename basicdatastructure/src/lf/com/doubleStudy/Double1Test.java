package lf.com.doubleStudy;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author linfan
 * @Date 2020/11/29 9:40
 * @Version 1.0
 */
public class Double1Test {
    public static void main(String[] args) {

    }

    /**
     * double会失去精度
     */
    @Test
    public void compare1() {
        double double1 = 1.0000000000000000001;
        double double2 = 1.0000000000000000002;
        System.out.println(double1==double2);
        System.out.println(double1 > 1);

    }

    /**
     * 不超过精度的比较
     */
    @Test
    public void compare2() {
        Double double1 = new Double(0.222);
        Double double2 = new Double(0.222);
        int i = double1.compareTo(double2);
        System.out.println(i);
        System.out.println(double1==double2);
        System.out.println(double1.equals(double2));
    }

    /**
     * 超过精度范围的比较 会失效   精度为小数后第16位
     */
    @Test
    public void compare3() {
        Double double1 = new Double( 1.00000000000000001101);
        Double double2 = new Double( 1.00000000000000001102);
        System.out.println(double1.hashCode());
        System.out.println(double2.hashCode());
        boolean equals = double1.equals(double2);
        System.out.println(equals);
        System.out.println(double1.compareTo(double2) );
        System.out.println(double1 > 1);
        System.out.println(double1.compareTo(new Double(1)));
    }

}
