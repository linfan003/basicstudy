package lf.com.hashMapStudy;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Author linfan
 * @Date 2020/12/4 9:02
 * @Version 1.0
 */
public class HashMap1Test {
    /**
     * 在新建一个HashMap时可以指定它的初始化大小，一般为2的幂次；默认的初始大小为16
     * 在put数据时，如果插入的条数小于初始大小*加载因子（默认为0.75），不会进行扩容
     *               插入的条数大于初始大小*加载因子（默认为0.75），会进行扩容，执行resize方法
     *
     */
    @Test
    public void test1() {

        HashMap<Object, Object> hashMap = new HashMap<>(32);
        System.out.println(hashMap);
        for (int i=0; i < 25; i++) {
            hashMap.put(i, i);
        }
        System.out.println(hashMap);
    }
    @Test
    public void test2() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        System.out.println(hashMap);
        for (int i=0; i < 13; i++) {
            hashMap.put(i, i);
        }
        System.out.println(hashMap);
    }
}
