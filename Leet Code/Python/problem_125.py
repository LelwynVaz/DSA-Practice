import re

class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if (s == " "):
            return True

        myStr = s
        # lowerStr = myStr.lower()
        cleanStr = re.sub('[^0-9a-zA-Z]+', '', myStr.lower())
        reverseStr = cleanStr[::-1]
        return cleanStr == reverseStr
        


s = Solution()
result = s.isPalindrome("A man, a plan, a canal: Panama")
print(result)
