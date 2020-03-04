'use strict';

    


function readLine() {f
    return inputString[currentLine++];
}
/*
 * Create the function factorial here
 */
    function factorial(n){
        let factorial_result = 1;
        console.log(factorial_result);
        for(let i=n;i>=1;i--){
            console.log(i);
            factorial_result=factorial_result*i;
            console.log(`factorial en proceso`, factorial_result);
        }
        console.log(factorial_result);
        return factorial_result;
    }

function main() {
    const n = 4;
    console.log(factorial(n));
}

main();