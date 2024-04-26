const http=require("http")
const port=3000;

//create server

http.createServer((req,res)=>{
    res.write("hello");
    res.end();
}).listen(3000);