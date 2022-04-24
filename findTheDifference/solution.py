class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        for letter in t:
            if letter not in s:
                return letter
            s = s.replace(letter, '', 1)

if __name__ == '__main__':
    s = Solution()
    orignalStr = "abcdefghijkl"
    newStr = "fhaclkzibdegj"
    assert(s.findTheDifference(orignalStr, newStr) == "z")