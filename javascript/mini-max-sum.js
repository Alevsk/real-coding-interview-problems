process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    arr = readLine().split(' ');
    arr = arr.map(Number);
    let total = 0;
    let min = 10000000000;
    let max = 0;
    for(var i=0; i < arr.length; i++) {
        total += arr[i];
    }
    for(var i=0; i < arr.length; i++) {
        const value = total - arr[i];
        if (value > max)
            max = value
        if (value <= min)
            min = value;
    }
    console.log(min + ' ' + max);
}
