const http=require('http');
const fs=require('fs');

//create server
const Server=http.createServer((req,res)=>{

    //routing request
    const url=req.url;
    const method=req.method;

    if(url==='/'){
        res.setHeader('content-type','text/html');
        res.write('<html>')
        res.write('<head><title>Enter details</title></head>')
        res.write('<body><form action="/message" method="Post"><input type="text" name="message"><input type="submit" value="send"></form></body>')
        res.write('</html>')
        return res.end();
    }


    //redirecting request
    if(url==='/message' && method =='POST'){
         fs.writeFileSync('hello.txt','Dummy');
         res.setHeader('Location','/')
         res.statusCode = 302;
        return res.end();
    }

    res.setHeader('content-type','text/html');
    res.write('<html>')
    res.write('<head><title>learn server module</title></head>')
    res.write('<body><h1>hello from server</h1></body>')
    res.write('</html>')
    res.end();
});
Server.listen(3004);

