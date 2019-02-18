//URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
//        has sufficient space at the end to hold the additional characters, and that you are given the "true"
//        length of the string. (Note: If implementing in Java, please use a character array so that you can
//        perform this operation in place.)
//        EXAMPLE
//        Input: "Mr John Smith ", 13
//        Output: "Mr%20John%20Smith"

package cracking.coding.interview_1.q3;

class q3 {
    String urlify(String str) {
        str = str.strip();

        StringBuilder ans = new StringBuilder(str);

        for (int i = ans.length() - 1; i > -1; i--) {
            if (ans.charAt(i) == ' ') {
                ans.delete(i, i + 1);
                ans.insert(i, "%20");
                i -= 1;
            }
        }
        return ans.toString();
    }
}
