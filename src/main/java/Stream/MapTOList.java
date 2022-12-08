package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTOList {
    public static void main(String[] args) {
        Map<Integer,String> map= getMap();
        //Convert Map keys to List
        List<Integer> keyList= new ArrayList<Integer>(map.keySet());
        keyList.forEach(key-> System.out.println(key));

        //Convert Map values to List
        List<String> valueList= new ArrayList<String>(map.values());
        keyList.forEach(value-> System.out.println(value));

    }

    static Map<Integer,String> getMap(){

        Map<Integer, String> sampleMap=new HashMap<Integer,String>();
        sampleMap.put(1,"Sunday");
        sampleMap.put(2,"Monday");
        sampleMap.put(3,"Tuesday");
        sampleMap.put(4,"Wednesday");
        return sampleMap;
    }
}
