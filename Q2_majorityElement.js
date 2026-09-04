function majorityElement(nums) {
    let count = 0;
    let candidate = 0;

    for (let i = 0; i < nums.length; i++) {
        if (count === 0) {
            candidate = nums[i];
        }
        
        if (nums[i] === candidate) {
            count++;
        } else {
            count--;
        }
    }

    return candidate;
}

const nums = [2, 2, 1, 1, 1, 2, 2];
const result = majorityElement(nums);
console.log("Majority Element:", result);
