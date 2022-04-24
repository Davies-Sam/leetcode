class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:       
        for letter in ransomNote:
            if letter not in magazine:
                return False
            else:
                magazine = magazine.replace(letter, '', 1)
        return True


if __name__ == '__main__':
    s = Solution()
    note = "give us money"
    magazine = "very unusual giant centipede swarm spotted"
    assert(s.canConstruct(note, magazine) == True)