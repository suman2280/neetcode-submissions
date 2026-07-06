class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        l, r, res = 0, len(nums) - 1, []

        while l <= r:
            if abs(nums[l]) < abs(nums[r]):
                res.append(nums[r] * nums[r])
                r -= 1
            else:
                res.append(nums[l] * nums[l])
                l += 1
        
        return res[::-1]