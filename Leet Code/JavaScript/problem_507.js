const checkPerfectNumber = function(num) {
    let sum = 1;

    if (num === 1) {
        return false;
    };

    for (let i = 2; i < Math.sqrt(num); i++) {
        if (num % i === 0) {
            sum += i + Math.floor(num / i);
        };
    };
    return sum === num;
};

const isperfect = checkPerfectNumber(28);
const isperfect1 = checkPerfectNumber(1);
console.log(isperfect, isperfect1);