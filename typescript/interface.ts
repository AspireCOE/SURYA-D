let draw=(number1,number2)=>{
   console.log(number1,number2)
}

draw("word",45)

let drawn=(value:number,value2:number)=>{
    console.log(value,value2);
}
draw(2,4)

let point=(point)=>{
    point.num1;
}

point({num1:1,num2:"string",num3:3})

let point1=(point1:{num1:number,num2:number})=>{
    point1.num1;
}

point1({num1:1,num2:54})

//interface
interface point2{
    number1:number,
    number2:number,
    number3:number
}
let point3=(point3:point2)=>{
}