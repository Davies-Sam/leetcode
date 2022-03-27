from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        s = set()
        
        for num in nums:
            if num in s:
                return True
            s.add(num)
            
        return False

if __name__ == '__main__':
    s = Solution()
    testcase  = [1,2,3,1]
    print(s.containsDuplicate(testcase))
