var n = 12;
var s = 'DDUUDDUDUUUD'

function countingValleys(n, s) {   
    var whereIAm = 0;
    var valleys = 0;

    for (var i = 0; i < n; i++) {
        if (s.charAt(i) == 'D') {
            whereIAm--;
            if (whereIAm == -1) {
                valleys++;
            }
        } else {
            whereIAm++;
        }

    }
    console.log(valleys);

}
countingValleys(n, s);
