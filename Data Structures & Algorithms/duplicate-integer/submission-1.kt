class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen: MutableSet<Int> = mutableSetOf()
        for (n in nums) {
            if (!seen.add(n))
                return true
        }
        return false
    }
}
