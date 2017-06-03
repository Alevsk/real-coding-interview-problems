const textOne = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque rhoncus neque condimentum, cursus felis et, varius augue. Maecenas dictum nisi at metus pulvinar dignissim. Maecenas pretium leo ac urna fermentum, a aliquam lectus gravida. Mauris nec magna velit. Vivamus tincidunt aliquam lectus ut finibus. Etiam vehicula libero in quam pretium feugiat. Duis id lacinia tortor, quis dignissim felis. Donec arcu magna, rhoncus dictum sapien et, fermentum eleifend mi. Nulla facilisi. Duis dapibus erat fermentum, tempus nulla vitae, scelerisque est. Suspendisse hendrerit eu eros ac ornare. Maecenas sem sem, vulputate at neque eu, lacinia ullamcorper lorem.";
const textTwo = "Sed in arcu arcu. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Ut mattis placerat luctus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris interdum, ipsum vitae hendrerit sagittis, nisl tortor gravida erat, ut euismod tellus tellus eu odio. Vivamus ac massa non arcu bibendum tempor. In sit amet metus est. Maecenas vel pellentesque ligula. Etiam vitae est non nunc fringilla mollis. Integer id aliquet magna, eget lacinia odio. Quisque aliquam, risus vitae ultrices placerat, dui velit fermentum magna, et consectetur mi enim ut lectus. Mauris ex leo, hendrerit ut aliquet ut, feugiat a turpis. In egestas viverra sagittis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.";

const mapOne = {};
const mapTwo = {};
var longest = null;

textOne.split(" ").forEach(function (word) {
   mapOne[word] = true;
});

textTwo.split(" ").forEach(function (word) {
   mapTwo[word] = true;
});

for (key in mapOne) {
    if (mapTwo[key]) {
        if(!longest)
            longest = key;
        if (key.length > longest.length) {
            longest = key;
        }
    }
};

console.log(longest);
