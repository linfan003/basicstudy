package lf.com.intStudy;

import org.junit.Test;

/**
 * @Author linfan
 * @Date 2020/11/29 10:00
 * @Version 1.0
 */
public class Int1Test {
    public static void main(String[] args) {

    }

    /**
     * 基本数据类型用==可以直接进行比较
     */
    @Test
    public void compare1() {
        int a = 127;
        int b = 127;
        System.out.println(a == b);
    }

    @Test
    public void compare2() {
        int a = 129;
        int b = 129;
        System.out.println(a == b);
    }

    /**
     * 当使用包装类型创建对象，创建的值位于【-128，127】时，会直接返回Integer缓存数组中相应的对象，超出范围会创建一个实例
     */
    @Test
    public void compare3() {
        Integer a = -128;
        Integer b = -128;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
        Integer c = 128;
        Integer d = 128;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
    }

    @Test
    public void compare4() {
        Integer a = new Integer(128);
        Integer b = new Integer(128);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
    }

    @Test
    public void compare5() {
        Integer a = 128;
        Integer b = new Integer(128);
        System.out.println(a .equals(b));
    }
}
