package lf.com.hashMapStudy;

/**
 * @Author linfan
 * @Date 2020/12/6 19:25
 * @Version 1.0
 */

import javafx.scene.media.VideoTrack;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Map的线程安全
 */
public class HashMap2Test {
    @Test
    public void hashmap() {
        /**
         * HashMap线程不安全，HashTable和ConcurrentHashMap线程安全
         *
         */
        /**
         * HashMap
         */
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(null, null);
        hashMap.put("1", null);
        System.out.println(hashMap);
        /**
         * ConcurrentHashMap
         */
        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        /*concurrentHashMap.put(null, null);*/
        /*concurrentHashMap.put("1", null);*/
        concurrentHashMap.put("1", "1");
        System.out.println(concurrentHashMap);
        /**
         * HashTable
         */
        Hashtable<Object, Object> hashtable = new Hashtable<>();
      /*  hashtable.put(null, null);*/
      /*  hashtable.put("1", null);*/
        hashtable.put("1", "1");
        System.out.println(hashtable);
    }
}
