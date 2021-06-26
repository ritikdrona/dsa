package maps;

import java.util.List;
import java.util.ArrayList;

public class Map<KT, VT> {
    List<KT> keys = new ArrayList<>();
    List<VT> values = new ArrayList<>();

    void put(KT key, VT value) {
        keys.add(key);
        values.add(value);
    }

    VT get(KT key) {
        return values.get(keys.indexOf(key));
    }

    VT remove(KT key) {
        int index = keys.indexOf(key);
        keys.remove(index);
        VT r = values.remove(index);
        return r;
    }

    @Override
    public String toString() {
        String r = "Map: ";
        for (int i = 0; i < keys.size(); i++) {
            r += "\n" + keys.get(i) + " --> " + values.get(i);
        }
        if (keys.size() == 0) {
            r += "(Empty)";
        }
        return r;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new Map<String, Integer>();
        System.out.println(map);
        map.put("ABC", 123);
        map.put("XYZ", 789);
        System.out.println(map);
        System.out.println(map.get("ABC"));
        map.remove("ABC");
        System.out.println(map);
    }
}
