const addStrings = function(num1, num2) {
    let sum = BigInt(num1) + BigInt(num2);
    return String(sum);
};

const sum = addStrings("111", "10");
console.log(sum);