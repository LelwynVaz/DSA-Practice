const divide = function(dividend, divisor) {
    let max = Math.pow(2, 31) - 1;
    let min = Math.pow(-2, 31);
    if (dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0) {
        let quotient = Math.trunc(dividend / divisor);
        if (quotient > max) {
            return max;
        };
        return quotient;
    };

    if (dividend < 0 || divisor < 0) {
        let quotient = Math.trunc(dividend / divisor);
        if (quotient < min) {
            return min;
        };
        return quotient;
    };
    return 0;
};

const result = divide(7, -3);
console.log(result);