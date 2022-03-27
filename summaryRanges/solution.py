from typing import List
class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        
        if not nums: return []
    
        ranges = [f"{nums[0]}"]
        lastNum = nums[0]
        
        for i, num in enumerate(nums[1:]):
            if num == lastNum + 1:
                addArrow = ranges[-1].split("->")
                addArrow[0] += f"->{num}"
                ranges[-1] = addArrow[0]
                lastNum = num
            else:
                ranges.append(f"{num}")
                lastNum = num
                                
        return ranges

if __name__ == "__main__":
    s = Solution()
    testCase = [0,1,2,4,5,7]
    print(s.summaryRanges(testCase))