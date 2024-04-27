//const http=require('http');
const express=require('express');
const MiddleWare=express();

MiddleWare.use((req,res,next)=>{
    console.log("First Middle Ware");
    next();
})

MiddleWare.use((req,res,next)=>{
    console.log("Second Middle Ware");
    next();
})

MiddleWare.use((req,res,next)=>{
    console.log("Third Middle Ware");
    res.send('<h1>hello</h1>')
})

//const server=http.createServer(MiddleWare);
//server.listen(3005);
MiddleWare.listen(3005);