function twoSum(nums, target) {
    const map = new Map();

    for (let i = 0; i < nums.length; i++) {
        let ele = target - nums[i];

        if (map.has(ele)) {
            return [map.get(ele), i];
        }

        map.set(nums[i], i);
    }
    return [];
}

const nums = [2, 7, 11, 15];
const target = 9;

const result = twoSum(nums, target);

console.log("Output: [" + result.join(", ") + "]");
