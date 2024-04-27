function greet(name, callback){
    console.log("hello "+name)
    callback()
}
function callme(){
    console.log("performing")
}
greet("ram",callme)