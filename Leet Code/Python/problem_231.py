class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        return n and not (n & n - 1)

sol = Solution()
result = sol.isPowerOfTwo(32)
print(result)