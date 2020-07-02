function Chicken(taste, price){
    this.taste = taste;
    this.price = price;
    this.method = function(){
        console.log("치킨 ㅁㅏ시써!!!");
    }
}
Chicken.prototype.showInfo = function(){
    console.log(`맛은 ${this.taste} 가격은 ${this.price}원 입니다.`);
}

FriedChicken.prototype = new Chicken("taste", "price");
function FriedChicken(taste, price){
    Chicken.apply(this, [taste, price]);
}

let kyochon = new FriedChicken("HoneyCombo", 52300);
let bbq = new FriedChicken("GoldFrideChicken", 99800);

kyochon.method();
kyochon.showInfo();
bbq.showInfo();