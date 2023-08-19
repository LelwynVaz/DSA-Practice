class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        return word.isupper() or word.islower() or word.istitle()

sol = Solution()
result = sol.detectCapitalUse("UsA")
print(result)