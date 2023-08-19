const detectCapitalUse = function(word) {
    let lower = word.toLowerCase();
    let first = word.charAt(0).toUpperCase();
    let capitalize = first + lower.slice(1);

    return word === capitalize || word === lower || word === word.toUpperCase();
};


console.log(detectCapitalUse("USA"));