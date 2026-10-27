class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val charCnt = HashMap<Char, Int>()
        for (ch in s) {
            charCnt[ch] = charCnt.getOrDefault(ch, 0) + 1
        }

        for (ch in t) {
            if (charCnt.getOrDefault(ch, 0) == 0)
                return false
            charCnt[ch] = charCnt[ch]!! - 1
        }
        return true
    }
}
