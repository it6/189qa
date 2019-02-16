//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.

package cracking.coding.interview_1.q2;

import java.util.HashMap;

class q2 {
    boolean checkPermutation(String s1, String s2) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            Character current = s1.charAt(i);
            hashMap.putIfAbsent(current, 0);
            hashMap.put(current, hashMap.get(current) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            Character current = s2.charAt(i);

            if (hashMap.get(current) == null) {
                return false;
            } else {
                int currentVal = hashMap.get(current);
                hashMap.put(current, currentVal - 1);
                if (hashMap.get(current) == 0) {
                    hashMap.remove(current);
                }
            }
        }
        return hashMap.isEmpty();
    }
}

