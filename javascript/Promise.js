// Promise-execution based on time
let myPromise=new Promise((myResolve,myReject)=>{
    myResolve();
}) 

myPromise.then(()=>{
    console.log("success");
}).catch(()=>{
    console.log("failed");
})
