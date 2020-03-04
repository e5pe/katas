"use strict";
exports.__esModule = true;
var Patata = /** @class */ (function () {
    function Patata() {
    }
    Patata.validatePin = function (pin) {
        // if(!Number.isSafeInteger(Number(pin)) || 
        // Number(pin)<0){
        // return false;
        if (Number.isInteger(Number(pin)) && Number(pin) >= 0) {
            return (pin.length == 4 || pin.length == 6);
        }
        else {
            return false;
        }
    };
    return Patata;
}());
exports.Patata = Patata;
console.log(Patata.validatePin('12.0'));
