// a = [ 1,2,4,5,7,8,9]
// a.forEach((value, index, array) => {
//     console.log(value, index, array)
    
// });


let arr = [ 1,13,5,73];
let newarr = [];

for (let index = 0; index < arr.length; index++) {
    const element = arr[index];
    newarr.push(element**2);
    // console.log(newarr) this is for every array formation from index 0 to 3 
    
} 
console.log(newarr)
// let arr = [ 1,13,5,73];
// let newarr = arr.map((e)=>{
//     return e**2
// })
// console.log(newarr)