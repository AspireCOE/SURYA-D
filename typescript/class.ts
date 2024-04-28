class Learn{
    value1:number;
    value2:number;

    sum=():any=>{
        console.log(this.value1+this.value2)
    }
    drawRectangle:()=>{
        sum()
    }
}

let object:Learn=new Learn();
object.drawRectangle();