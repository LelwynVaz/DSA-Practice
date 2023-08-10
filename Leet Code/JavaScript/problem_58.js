const lengthOfLastWord = function(s) {
    let myStr = s;
    myStr = myStr.trim()
    let lastSpaceIndex = myStr.lastIndexOf(' ')
    if (lastSpaceIndex === -1) {
        return myStr.length;
    }
    return myStr.length - lastSpaceIndex - 1;
};

let inputStr = "h";
inputStr.length;
const result = lengthOfLastWord(inputStr);
console.log("the length of the last word in string is ", result);