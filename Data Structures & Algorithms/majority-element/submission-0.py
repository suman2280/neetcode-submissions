class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        el = 0

        for n in nums:
            if count == 0:
                count = 1
                el = n
            elif el == n:
                count += 1
            else:
                count -= 1
        
        return el