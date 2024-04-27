const express=require('express');
const Middlewareusingpath=express();


Middlewareusingpath.use('/second',(req,res,next)=>{
    console.log('second middleware')
    res.send('<h1>Second page</h1>')
})

Middlewareusingpath.use('/third',(req,res,next)=>{
    console.log('third middleware')
    res.send('<h1>third page</h1>')
})

//always running middle ware
Middlewareusingpath.use('/',(req,res,next)=>{
    console.log('first middleware');
    res.send('<h1>first page</h1>')
    
})


Middlewareusingpath.listen(3006)