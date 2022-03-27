from typing import List
class Solution:
    def missingNumber(self, nums: List[int]) -> int:

        s = sum(nums) # O(n)
        l = len(nums) # O(1)

        expected = int( ((l/2) * (l+1)) ) # gaussian summation
        
        # difference between gaussian sum and list sum == missing number
        return expected - s 

if __name__ == "__main__":
    s = Solution()
    testCase = [0,4,5,23,1,7,8,6,9,10,11,2,3,12,13,14,15,16,18,19,20,21,22]
    print(s.missingNumber(testCase))