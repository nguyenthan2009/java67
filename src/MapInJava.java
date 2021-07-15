
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

public class MapInJava {
    public static void main(String[] args) {
        String str = "Bài này khoai vãi, cáu vch, cáu thực sự";
        String[] arr = str.split(" ");
        String key="";
        Integer value;
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for(int i=0;i<arr.length;i++){
            key = arr[i];
            if(map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key, value+1);
            } else{
                map.put(key, new Integer(1));
            }
        }
        Set set=map.keySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            key=(String)i.next();
            System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
        }
    }
}
