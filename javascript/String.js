let string="Hello World wello"
console.log(string.length)
console.log(string.charAt(2))
console.log(string.at(4))
console.log(string.charCodeAt(0))
 var subString=string.substring(1,6)
 console.log(subString)
 console.log(string.slice(1,5))
 console.log(string.substr(1,5))

 var slicevar=string.slice(-5)
 console.log(slicevar)

 console.log(string.repeat(3))
 var replaceVar=string.replace('l','y')
 var replaceAllvar=string.replaceAll('l','y') 

 console.log(replaceVar)
 console.log(replaceAllVar)

 var word=string.match("llo")
 var word1=string.matchAll("llo")
 console.log(word)
 console.log(word1)