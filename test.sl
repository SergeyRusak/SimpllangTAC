var x = 10;
var y = 20;
var z = 0;
var bool = true;
var string = "some text";

for (var i = 0; i < 5; i = i + 1) {
    print("Loop iteration: " + i);
}

while (x > 0) {
    print(x);
    x = x - 1;
}

if (x > y) {
    z = x + y;
} elif (x == y) {
    z = 0;
} else {
    z = x - y;
}
print("Result is: " + z);


