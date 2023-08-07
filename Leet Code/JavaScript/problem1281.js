const subtractProductSum = (num) => {
    let sum = 0;
    let product = 1;

    while (num > 0) {
        sum += (num % 10);
        product *= (num % 10);
        num = Math.floor(num / 10);
    };
    return product - sum;
};

console.log("Result is ", subtractProductSum(4421));