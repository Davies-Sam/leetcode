class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        number = 0
        l = list("ABCDEFGHIJKLMNOPQRSTUVWXYZ")

        for i in range(len(columnTitle)):
          number*=26
          number+=l.index(columnTitle[i])+1
            
        return number

if __name__ == "__main__":
    s = Solution()
    testCase = "IOZ"
    print(f"{testCase} column number is: {s.titleToNumber(testCase)}")