const express=require('express');
const ParsingData=express();
const bodyParser=require('body-parser');

ParsingData.use(bodyParser.urlencoded());

ParsingData.use('/add-product',(req,res,next)=>{
    res.send('<h1>Add product</h1><form action="/store-product" method="POST"><input type="text" name="title"/><input type="submit" value="submit"/></form>');
})

ParsingData.use('/store-product',(req,res,next)=>{
    console.log('Form data:',req.body);
    res.send('<h1>product submitted</h1>');
})

ParsingData.listen(3011);