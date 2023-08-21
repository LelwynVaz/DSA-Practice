const addDigits = function(num) {
    if (num < 10) {
        return num;
    };

    let numSum = num;
    while (numSum >= 10) {
        let sum = digitSum(numSum);
        numSum = sum;
    };
    
    return numSum;
    
};

const digitSum = function(number) {
    let sum = 0;
    while (number > 0) {
        let last = number % 10;
        sum += last;
        number = Math.floor(number / 10);
    };
    return sum;
};

const result = addDigits(38);
console.log(result);