class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        result = (float)(pow(x, n))
        return result

mySol = Solution()
output = mySol.myPow(2.00000, 10)
print(output)