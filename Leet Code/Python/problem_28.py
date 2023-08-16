class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        return haystack.find(needle)
    

sl = Solution()
haystack = input("Enter haystack: ")
needle = input("Enter needle: ")
index = sl.strStr(haystack, needle)
print(index)