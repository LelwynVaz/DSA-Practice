const isPalindrome = function(s) {
    if (s === " ") {
        return true;
    };

    let cleanStr = s.replace(/[^A-Za-z0-9]/gi, '');
    let lowerStr = cleanStr.toLowerCase();
    let reverseStr = "";

    for (let i = lowerStr.length - 1; i >= 0; i--){
        reverseStr = reverseStr + lowerStr[i];
    };

    console.log(lowerStr);
    console.log(reverseStr);
    return lowerStr === reverseStr;
};

const result = isPalindrome("hello / wor,@ld");
console.log(result);