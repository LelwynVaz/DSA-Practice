
import math

class Solution(object):
    def mySqrt(self, x):
        sqRoot = int(math.sqrt(x))
        return sqRoot

num = int(input("Enter number: "))
sq = Solution()
print(f'Square root of {num} is {sq.mySqrt(num)}')
