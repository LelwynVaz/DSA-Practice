class Solution(object):
    def divide(self, dividend: int, divisor: int) -> int:
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """ 
        max = pow(2, 31) - 1
        min = pow(-2, 31)
        if (dividend < 0 and divisor < 0 or dividend > 0 and divisor > 0) :
            quotient = (int)(dividend / divisor)
            if ( quotient > max) :
                return max
            return quotient
        
        if (dividend < 0 or divisor < 0) :
            quotient = (int)(dividend / divisor)
            if (quotient < min) :
                return min
            return quotient
        
        return 0


sol = Solution()
result = sol.divide(7, -3)
print(result)