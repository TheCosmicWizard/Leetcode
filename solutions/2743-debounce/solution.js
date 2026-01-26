/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let timerID = null;
    return function(...args) {
        if (timerID != null){
            clearTimeout(timerID);
        }
        timerID = setTimeout(() =>{
            fn(...args);
            timerID = null;
        },t);
    }
};


