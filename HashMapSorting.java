import java.util.*;

public class HashMapSorting {

    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('B', 2);
        map.put('A', 4);
        map.put('D', 1);
        map.put('F', 9);
        map.put('C', 3);


        for(Map.Entry<Character, Integer>  e: map.entrySet())
        {
            System.out.println(e.getKey()+"--"+e.getValue());

        }
        List<Map.Entry<Character, Integer>> list=new ArrayList<>();
        for(Map.Entry<Character, Integer>  e: map.entrySet())
        {
            list.add(e);
        }
        Comparator<Map.Entry<Character, Integer>> com=new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        };

        Collections.sort(list,com);

        Map<Character, Integer> sortMap =new LinkedHashMap<>();

        for(Map.Entry<Character, Integer>  e: list)
        {
            sortMap.put(e.getKey(),e.getValue());

        }

        for(Map.Entry<Character, Integer>  e: sortMap.entrySet())
        {
            System.out.println(e.getKey()+"--"+e.getValue());

        }








    }

}
