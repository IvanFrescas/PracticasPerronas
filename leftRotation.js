var a = [1,2,3,4,5];
var d = 4;

function leftRotationSlower(a, d){
    var ban = 0;
    var print = '';
    for(var i=0; i<d; i++){
        ban = a[0];
        for(var j = 0; j< a.length; j++){
            a[j] = a[j+1];
        }
        a[a.length-1]=ban;
    }
    console.log(print);
}

function leftRotationFaster(a, d){
    var ban = 0;

    for(var i=0; i<d; i++){
        ban = a[0];
        a.shift(a[i]);
        a.push(ban);
    }

    console.log(a);
}

leftRotation(a, d);