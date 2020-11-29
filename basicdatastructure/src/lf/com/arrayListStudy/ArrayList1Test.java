package lf.com.arrayListStudy;

import org.junit.Test;

import java.util.ArrayList;
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

    @Test
    /**
     *
     */
    public  void remove1() {
        for (String str : list){
            if (target.equals(str)){
                list.remove(str);
                break;
            }
        }
        print(list);
    }
    @Test
    public  void remove2() {
        int size = list.size();
        for(int i = 0; i < size; i++){
            String item = list.get(i);
            if(target.equals(item)){
                list.remove(item);
            }
        }
        print(list);
    }
}
