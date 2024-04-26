const fs=require('fs');

//read file

const fileContent=fs.readFileSync("./file.txt", "utf-8"); //utf-8 return the file content in string
console.log(fileContent)

fs.readFile("./file.txt","utf-8", (err,data) => {
      if(err){
        console.log("error in reading file")
      }
      else{
        console.log(data)
      }
})

// write file

fs.writeFileSync("./greet.txt","welcome to learn write file in node js");

fs.writeFile("./greet.txt" ,"welocme to learn node js",{flag:"a"},(err)=>{// flag is used to append content in both file
    if(err){
        console.log(error);
    }
    else{
        console.log("file written");
    }
})