class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(s.split()) != len(pattern): 
            return False
        
        pattern_lookup = {}
        pattern_in_nums = ""

        word_lookup = {}
        s_in_nums = ""

        words = s.split()

        i = 0
        for i in range(len(pattern)):
            if pattern[i] not in pattern_lookup.keys():
                pattern_lookup[pattern[i]] = str(i)
            pattern_in_nums += pattern_lookup[pattern[i]]
            if words[i] not in word_lookup.keys():
                word_lookup[words[i]] = str(i)
            s_in_nums += word_lookup[words[i]]
            i+=1

        return s_in_nums == pattern_in_nums

if __name__ == "__main__":
    s = Solution()
    test_pattern = "abba"
    test_string = "dog cat cat dog"
    assert(s.wordPattern(test_pattern, test_string))
    test_pattern = "abcd"
    test_string = "dog cat elephant carrot"
    assert(s.wordPattern(test_pattern, test_string))
    test_pattern = "abba"
    test_string = "dog cat cat cow"
    assert(not s.wordPattern(test_pattern, test_string))
