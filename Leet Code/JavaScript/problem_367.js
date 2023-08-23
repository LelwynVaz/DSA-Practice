const isPerfectSquare = function(num) {
    return Number.isInteger(Math.sqrt(num));
};

const result = isPerfectSquare(14);
console.log(result);