package collectionAndHashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetAndMapAndHashMap {
    /*
     * This is used to control the key
     * unlike the Array ==> you can't change to index
     *
     * */
    public static void amerMap() {
        /*
        implementing for Map Interface * علشان ال  [HashMap ]عامل
        * */
        Map<String, Integer> alaaMap = new HashMap<String, Integer>();
        alaaMap.put("AbdoAmer", 0101);
        alaaMap.put("Mohamed", 0101);
        alaaMap.put("potter", 0220);
        alaaMap.put("Mohamed", 0101);
        alaaMap.put("What", 8383);
        alaaMap.put("Ali", 232);
        alaaMap.put("Mohamed", 9039);
        alaaMap.put("Mostafa", 0101);
        alaaMap.put("yara", 23);
        alaaMap.put("Mohamed", 0101);

        /*
           alaaMap.keySet() ;
        * This will return All Keys in a Set uaamer
        * */

        Set<String> set = alaaMap.keySet();
        System.out.println(set);

        System.out.println(alaaMap.remove("yarar"));
    }

    /*
     * How to loop over the Map uaAlaa
     * solution use keySet()
     * */

    public static void loopOverMap(HashMap<String, String> hashMap) {
        for (String key : hashMap.keySet()) {
            String valueOfKey = hashMap.get(key);
            System.out.println(valueOfKey);
        }
    }

    /*
     * Set contains of some Entries [Single Entry ]
     *{
     * {String , String } ,  ==> This is single Entry
     * {String , String } ,   ==> This is single Entry
     * {String , String } ,   ==> This is the single Entry
     * {} ,   === This is the single Entry
     *
     * }
     *
     * */

    //     ازاي تخرج ال القيمة من ال entry الموجود عندنا في ال hashMap
    //     Entry هو عبارة عن كلاس داخلي
    public static void getEntriesOfSet(HashMap<String, String> hashMap) {
        for (Map.Entry<String, String> singleEntry : hashMap.entrySet()) {
            System.out.println(singleEntry.getValue());
        }
    }


    public static void main(String[] args) {
//        amerMap();
        HashMap<String, String> alaaMap = new HashMap<String, String>();
        alaaMap.put("mohaemd", "323255");
        alaaMap.put("about", "33223");
        alaaMap.put("What", "0439204");
        alaaMap.put("Potter", "934829");
        alaaMap.put("alaa", "0439204");
        alaaMap.put("yara", "774");

//        loopOverMap(alaaMap);
        getEntriesOfSet(alaaMap);
    }
}
