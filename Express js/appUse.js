const http=require('http');

const express=require('express');
const appUse=express();

// if we give use function browser waiting for response
// it is used to insert the middle ware 
appUse.use(()=>{     
    console.log("Express works!");
})

const server=http.createServer(appUse);
server.listen(3001);