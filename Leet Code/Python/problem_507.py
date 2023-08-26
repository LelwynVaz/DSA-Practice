import math
class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        sum = 1

        if(num == 1):
            return False

        count = 2
        while(count < math.sqrt(num)):
            if(num % count == 0):
                sum += count + (num / count)
            count += 1
        return sum == num

sl = Solution()
isperfect = sl.checkPerfectNumber(28)
print(isperfect)