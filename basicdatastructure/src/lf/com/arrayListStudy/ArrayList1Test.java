package lf.com.arrayListStudy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author linfan
 * @Date 2020/11/29 11:27
 * @Version 1.0
 */
public class ArrayList1Test {

    /**
     * 删除元素
     */
    private static ArrayList<String> list = new ArrayList<>();
    static {
        list.add("beijing");
        list.add("shanghai");
        list.add("guangzhou");
        list.add("shenzhen");
        list.add("hangzhou");
    }
    private static  String target = "hangzhou";


    private static void print(List<String> list){
        for (String item : list) {
            System.out.println("元素值：" + item);
        }
    }

    /**
     * 无法重复删除
     */
    @Test
    public  void remove1() {
        for (String str : list){
            if (target.equals(str)){
                list.remove(str);
                break;
            }
        }
        print(list);
    }
    /**
     * 错误
     */
    @Test
    public  void remove2() {
        for (String str : list){
            if (target.equals(str)){
                list.remove(str);
            }
        }
        print(list);
    }
    /**
     * 错误，在删除时会删除指定下标的元素，但是整个列表会前移，造成元素遗漏
     */
    @Test
    public  void remove3() {
        for(int i = 0; i < list.size(); i++){
            String item = list.get(i);
            if("shanghai".equals(item)){
                list.remove(item);
            }
        }
        print(list);
    }
    /**
     * 会造成异常
     *  删除 末尾 的元素，会造成 modCount 和 expectedModCount 的不一致导致异常抛出。
     */
    @Test
    public  void remove4() {
        for(int i = 0; i < list.size(); i++){
            String item = list.get(i);
            if(target.equals(item)){
                list.remove(item);
            }
        }
        print(list);
    }

    /**
     * 迭代器删除
     */
    @Test
    public  void remove5() {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            if (item.equals(target)) {
                iter.remove();
            }
        }
        print(list);
    }

    /**
     * 倒序删除，不会造成元素的遗漏
     */
    @Test
    public  void remove6() {
        for(int i = list.size() - 1; i >= 0; i--){
            String item = list.get(i);
            if(target.equals(item)){
                list.remove(item);
            }
        }
        print(list);
    }
}
