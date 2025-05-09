package DSA;
import java.util.*;


//ArrayList - print kr de raha dublicate
//public class Collection {
//    public static void main(String[] args){
//        ArrayList<Integer> List = new ArrayList<>();
//        List.add(34);
//        List.add(89);
//        List.add(77);
//        List.add(34);
//        System.out.println(List);
//
//        for (int a : List){
//            System.out.println(a);
//        }
//        for (int i = 0; i <List.size(); i++) {
//            System.out.println(List.get(i));
//        }
//    }
//}

//Set - dublicate print ni kr rha
//public class Collection {
//    public static void main(String[] args){
//        Set<Integer> set = new HashSet<>();
//        set.add(23);
//        set.add(34);
//        set.add(34);
//        System.out.println(set);
//    }
//}

//set - me hi treeset for sorted array
//public class Collection {
//    public static void main(String[] args) {
//        int arr[] = {1, 1, 3, 4, 5, 4, 5, 5, 3, 4, 7, 8, 26};
//        Set<Integer> set = new TreeSet<>();
//        for (int a : arr) set.add(a);
//        System.out.println(set);
//    }
//}



//Map - value renew kr ke add karega
//public class Collection {
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("lachi", 28);
//        map.put("lovely", 98);
//        map.put("prachi", 99);
//        System.out.println(map);
//        map.put("prachi", 100);
//        System.out.println(map);
//
////      generic function
//        for (Map.Entry<String, Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//        }
//
////      lambda function
//        map.forEach((k, v) -> System.out.println(v) );
//    }
//}



//map - frequecy check karega
public class Collection {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5,6,6,66,4,44,56};
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr){
            map.put(a , map.getOrDefault(a, 0)+1);

        }

//        for printing
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }

    }
}