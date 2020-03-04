export class Patata {
static validatePin(pin: string): boolean {
    if(Number.isInteger(Number(pin)) && Number(pin)>=0
    && (pin.length == 4 || pin.length == 6)){
        for(let i of pin){
          if(i < '0' || i > '9'){ 
            return false; 
          }
        }
        return true;
    } else {
      return false;
    }
  }
}

console.log(Patata.validatePin('12.0'))