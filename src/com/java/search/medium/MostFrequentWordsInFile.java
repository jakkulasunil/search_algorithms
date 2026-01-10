package com.java.search.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class MostFrequentWordsInFile {

	 public static void processText(String text, int k) {
	        
	        // Store Frequencies of all words
	        Map<String, Integer> freqMap = new HashMap<>();
	        String[] words = text.split(" ");
	        for (String word : words) {
	            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
	        }

	        // Store frequency map items in a priority queue (or min heap)
	        // with frequency as key
	        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
	            (a, b) -> a.getValue() - b.getValue()
	        );
	        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
	            pq.offer(entry);
	            if (pq.size() > k) pq.poll();
	        }
	        // Get the top frequency items 
	        List<Map.Entry<String, Integer>> res = new ArrayList<>();
	        while (!pq.isEmpty()) {
	            res.add(pq.poll());
	        }

	        // Reverse to get the desired order
	        Collections.reverse(res);
	        for (Map.Entry<String, Integer> entry : res) 
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "Welcome to the world of Geeks Geeks for Geeks is great";
	        processText(text, 5);

	}

}
