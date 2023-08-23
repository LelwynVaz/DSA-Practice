import math

class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        return math.sqrt(num).is_integer()

s = Solution()
result = s.isPerfectSquare(16)
print(result)