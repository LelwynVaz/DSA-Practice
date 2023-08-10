class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        myStr = s.strip()
        lastWord = myStr.rfind(' ')

        if (lastWord < 0) :
           return len(myStr)
        
        return len(myStr) - lastWord - 1


s = Solution()
inputStr = input("Enter anything: ")
lastWordCount = s.lengthOfLastWord(inputStr)
print("The length of last word in string entered is ", lastWordCount)