const person={
    name:"martin"
};
// coppy one object to another one
const student={...person,age:23}//{...object name} spread operator
console.log(student)


//rest operator (... arguments)
const toArray=(...args)=>{
    return args;
}

console.log(toArray(1,2,3,4,5,6));