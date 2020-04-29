var s = 'aba';
var n = 10;

function repeatedString(s, n) {

    var numberOfCharacters = s.length;
    var manyTimes = n / numberOfCharacters;
    var manyTimesMod = n % numberOfCharacters;

    var infinityStrings = '';


    console.log(numberOfCharacters);

    for (i = 0; i < manyTimes; i++) {
        infinityStrings += s;
    }
    infinityStrings = infinityStrings.slice(0, n);

    for (i = 0; i < n; i++) {
        if (infinityStrings.charAt(i) == 'a') {
            numberOfA++;
        }
    }



    console.log(numberOfA);

}

function CountingA(s, n) {
    var numberOfA = 0;

    for (var i = 0; i < s.length; i++) {
        if (s.charAt(i) == 'a') {
            numberOfA++;
        }
    }
    var manyTimes = n / s.length;
    manyTimes = Math.floor(manyTimes);
    var manyTimesMod = n % s.length;
    var result = manyTimes * numberOfA;
    console.log(result);
    
    for (var i = 0; i < manyTimesMod; i++) {
        if (s.charAt(i) == 'a') {
            result++;
        }
    }
    console.log(result);

}

CountingA(s, n);    //good performance
//repeatedString(s, n); //bad performance