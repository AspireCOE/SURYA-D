const http=require("http");

//create server

const Server=http.createServer((req,res)=>{

    //routing request
    const url=req.url;
    if(url==='/'){
        res.setHeader('content-type','text/html');
        res.write('<html>')
        res.write('<head><title>Enter details</title></head>')
        res.write('<body><form action="/message" method="Post"><input type="text" name="message"><input type="submit" value="send"></form></body>')
        res.write('</html>')
        return res.end();
    }


 

    res.setHeader('content-type','text/html');
    res.write('<html>')
    res.write('<head><title>learn server module</title></head>')
    res.write('<body><h1>hello from server</h1></body>')
    res.write('</html>')
    res.end();
});
Server.listen(3003);