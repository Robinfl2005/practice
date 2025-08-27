/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: function(other) {
            if(val!==other) throw "Not Equal";
            return true;
        },
        notToBe: function(other) {
            if(val===other) throw "Equal";
            return true;
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */