const http=require("http");

//create server

const Server=http.createServer((req,res)=>{
 

    res.setHeader('content-type','text/html');
    res.write('<html>')
    res.write('<head><title>learn server module</title></head>')
    res.write('<body><h1>hello from server</h1></body>')
    res.write('</html>')
    res.end();
});
Server.listen(3002);