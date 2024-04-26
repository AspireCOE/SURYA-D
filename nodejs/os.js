const os=require('os');


 var totalMemory=os.totalmem();
 var freeMemory=os.freemem();

 console.log('totalMemory: '+ totalMemory);
 console.log('free Memory: '+ freeMemory);


console.log(os.arch());

console.log(os.cpus());

console.log(os.hostname());

console.log(os.platform());

console.log(os.release());

console.log(os.type());

console.log(os.userInfo());
