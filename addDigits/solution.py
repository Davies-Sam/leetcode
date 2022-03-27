class Solution:
    def addDigits(self, num: int) -> int:
        strNum = str(num)
        
        while len(strNum) != 1:
            newNum = 0
            for i in range(len(strNum)):
                newNum += int(strNum[i])
            strNum = str(newNum)
        return int(strNum)


if __name__ == "__main__":
    s = Solution()
    testCase = 28
    print(s.addDigits(testCase))