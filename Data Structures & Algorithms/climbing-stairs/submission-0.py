class Solution:
    def climbStairs(self, n: int) -> int:
        first, second = 0, 1
        for _ in range(n):
            tmp = second
            second += first
            first = tmp
        return second
