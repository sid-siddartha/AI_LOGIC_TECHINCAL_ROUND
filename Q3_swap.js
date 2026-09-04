function maximumSwap(num) {
    let digits = num.toString().split('');
    let lastIndex = new Array(10).fill(-1);

    for (let i = 0; i < digits.length; i++) {
        lastIndex[digits[i] - '0'] = i;
    }

    for (let i = 0; i < digits.length; i++) {
        for (let d = 9; d > (digits[i] - '0'); d--) {
            if (lastIndex[d] > i) {
                let temp = digits[i];
                digits[i] = digits[lastIndex[d]];
                digits[lastIndex[d]] = temp;
                return parseInt(digits.join(''));
            }
        }
    }

    return num;
}

const num = 2736;
const result = maximumSwap(num);
console.log("Output:", result);
