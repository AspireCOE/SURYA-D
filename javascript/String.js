let a="Hello World wello"
console.log(a.length)
console.log(a.charAt(2))
console.log(a.at(4))
console.log(a.charCodeAt(0))
 var b=a.substring(1,6)
 console.log(b)
 console.log(a.slice(1,5))
 console.log(a.substr(1,5))

 var c=a.slice(-5)
 console.log(c)

 console.log(a.repeat(3))
 var d=a.replace('l','y')
 var e=a.replaceAll('l','y') 

 console.log(d)
 console.log(e)

 var f=a.match("llo")
 var g=a.matchAll("llo")
 console.log(f)
 console.log(g)