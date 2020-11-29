package lf.com.objectStudy;

import org.junit.Test;

/**
 * @Author linfan
 * @Date 2020/11/29 10:55
 * @Version 1.0
 */
public class Object1Test {
    @Test
    public void object_class_study() {
        Object o = new Object();

        System.out.println(o.equals("1"));
        System.out.println(o.hashCode());
        //getClass()返回一个Class对象
        System.out.println(o.getClass());
        //toString()返回一个String对象，用来标识自己
        System.out.println(o.toString());

    }
}
