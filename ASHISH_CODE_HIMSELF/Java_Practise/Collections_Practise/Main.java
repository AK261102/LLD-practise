package ASHISH_CODE_HIMSELF.Java_Practise.Collections_Practise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> l1= new ArrayList<>()
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(1,100);
        l1.get(0);
        l1.set(1,200);
        l1.remove(0);
        l1.size();
        l1.isEmpty();
        l1.contains(10);
        l1.indexOf(100);


        LinkedList<Integer> ll = new LinkedList();
        ll.addFirst(10);
        ll.addLast(20);
        ll.getFirst();
        ll.getLast();
        ll.removeFirst();

        Map<String,Integer> mp = new HashMap<>();
        mp.put("age",25);
        mp.get("age");
        mp.getOrDefault("height",0);
        mp.containsKey("age");
        mp.containsValue("25");
        mp.remove("age");
        mp.size();
        mp.isEmpty();

        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);

        for(String entrykey: mp.keySet())
        {
            System.out.println("key hai ye ="+entrykey +" value is this = "+mp.get(entrykey));
        }

        Map<String,Integer> sorted = new TreeMap<>();

        Map<String,Integer> ordered= new LinkedHashMap<>();

        Set<String> st=new HashSet<>();
        st.add("hello");
        st.contains("hello");
        st.remove("hello");
        st.size();

        TreeSet <Integer> st1= new TreeSet<>();

        st1.add(10);
        st1.add(20);
        st1.add(30);
        st1.first();
        st1.last();
        st1.lower(20);
        st1.higher(20);

        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.pop();


        Queue<E> <Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.peek();
        queue.pop();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        List<Integer> nums = new ArrayList<>(List.of(1,5,6,4,8));
        Collections.sort(nums);
        Collections.sort(nums,Collections.reverseOrder());

        Map<String,Integer> mp =new HashMap<>();
        String [] items = {"a","a","a","b","b","c"};
        for(String key:items)
        {
            mp.merge(item,1,Integer::sum);
        }
    }
}
