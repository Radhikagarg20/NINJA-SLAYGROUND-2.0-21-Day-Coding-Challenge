//Nth Fibonacci Number

function findNthFibonacci(n) {
    if (n === 1 || n === 2) {
        return 1;
    }

    let x = 1, y = 1; 
    for (let i = 3; i <= n; i++) {
        let fib = x + y;
        x = y;
        y = fib;
    }
    return y;
}

module.exports.findNthFibonacci = findNthFibonacci;
