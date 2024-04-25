const cars=["BMW","Audi","Benz"]
console.log(cars[0])




for(let i=0;i<cars.length;i++){
    console.log(cars[i])
}

cars.push("toyota")

console.log(cars)

console.log(cars.length)

let arr=[1,2,3,4,5,6,7,"Apple"]
console.log(arr.toString())

console.log(arr.join("*"))

console.log(arr.at(2))

arr.push("150")
console.log(arr)

arr.pop()
console.log(arr)

//shift() removed the first element in the array

arr.shift()
console.log(arr)

//unshift add the element to begining 
arr.unshift(100)
console.log(arr)

arr1=cars.concat(arr)
console.log(arr1)

console.log(arr.indexOf(100))
console.log(arr.includes(100))
console.log(arr.includes(180))

arr1.sort()
console.log(arr1)

arr1.reverse()
console.log(arr1)

//copy one array to another one

arr2=arr1.slice()
console.log(arr2)