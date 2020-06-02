var bill= [3, 10, 2, 9]
var k = 1;
var b = 7;

function bonAppetite(bill, k, b){

    var total = 0;
    var splitAccount = 0;
    bill.map((item) => total += item);
    splitAccount = (total - bill[k])/2;
    if(b == splitAccount){
        console.log('Bon Appetit');
    }else{
        console.log(b-splitAccount);
    }
}
bonAppetite(bill, k, b);