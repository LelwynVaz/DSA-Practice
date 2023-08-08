const isPalindrome = function(x) {
    if ( x < 0) {
        return false;
    };
    let temp = x;
    let reverse = 0;

    while (temp > 0) {
        reverse = (reverse * 10) + (temp % 10);
        temp = Math.floor(temp / 10);
    };
    return (reverse === x);
};

result = isPalindrome(1423241);
console.log(result);