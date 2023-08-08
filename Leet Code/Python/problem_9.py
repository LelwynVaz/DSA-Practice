class Solution(object):
    def isPalindrome(self, x):
        if ( x < 0):
            return False

        reverse = 0
        temp = x
        while (temp > 0):
            reverse = (reverse * 10) + (temp % 10)
            temp = temp // 10

        return (reverse == x)

myObj = Solution()
num = int(input("Enter number: "))
print(myObj.isPalindrome(num))