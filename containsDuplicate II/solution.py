from curses.ascii import SO
from typing import List

class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        s = {}
        
        for i, num in enumerate(nums):
            if num in s:
                if abs(s[num] - i) <= k:
                    return True
            s[num] = i
        return False

if __name__ == '__main__':
    s = Solution()
    testCase, k = [1,2,3,1], 3
    print(s.containsNearbyDuplicate(testCase, k))
                    