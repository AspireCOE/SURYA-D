const map=new Map()
map.set("ram",1000)
map.set("ragu",2000)
map.set("jenny",3000)
console.log(map)

map.delete("ram")
console.log(map)

map.delete(2000)
console.log(map)


console.log(map.has("ragu"))

console.log(map.values())

console.log(map.keys())