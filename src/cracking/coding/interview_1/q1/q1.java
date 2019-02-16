// Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

package cracking.coding.interview_1.q1;

import java.util.HashSet;

class q1 {

    boolean isUnique(String str) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int current = Character.toLowerCase(str.charAt(i));
            if (hashSet.contains(current)) {
                return false;
            }
            hashSet.add(current);
        }
        return true;
    }
}
