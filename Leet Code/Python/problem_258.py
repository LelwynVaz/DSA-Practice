class Solution:
    def addDigits(self, num: int) -> int:
        if (num < 10):
            return num
        sumDigit = num
        while (sumDigit >= 10):
            newDigit = self.digitSum(sumDigit)
            sumDigit = newDigit

        return sumDigit

    def digitSum(self, num: int) -> int:
        sum = 0
        while (num > 0):
            last = num % 10
            sum += last
            num = num // 10
        return sum

sol = Solution()
result = sol.addDigits(38)
print(result)
