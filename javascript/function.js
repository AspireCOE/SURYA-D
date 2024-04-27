function basic(){
    console.log("function block")
}
basic()

function samsung(){
    console.log("samsung ")
    oppo()
}
function oppo(){
    console.log("oppo")
    apple()
}
function apple(){
    console.log("apple")
}
samsung()

function add(num1,num2){
    console.log(num1+num2)
}
add(10,20)

function name(){
    return "john"
}
console.log(name())