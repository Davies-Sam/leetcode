class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        
        firstMap = {}
        firstList = []
        firstCount = 0
        
        secondMap = {}
        secondList = []
        secondCount = 0
        
        for letter in s:
            if letter in firstMap.keys():
                firstList.append(firstMap[letter])
            else:
                firstMap[letter] = firstCount
                firstCount += 1
                firstList.append(firstMap[letter])
             
        for letter in t:
            if letter in secondMap.keys():
                secondList.append(secondMap[letter])
            else:
                secondMap[letter] = secondCount
                secondCount += 1
                secondList.append(secondMap[letter])
                
        return firstList == secondList

if __name__ == "__main__":
    s = Solution()

    str1 = "egg"
    str2 = "add"

    print(f"{str1} & {str2} are isomorphic: {s.isIsomorphic(str1,str2)}")

    str3 = "foo"
    str4 = "bar"

    print(f"{str3} & {str4} are isomorphic: {s.isIsomorphic(str3,str4)}")

    str5 = "paper"
    str6 = "title"

    print(f"{str5} & {str6} are isomorphic: {s.isIsomorphic(str5,str6)}")

