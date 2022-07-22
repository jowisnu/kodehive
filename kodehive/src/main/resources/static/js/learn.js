
var buku = {
	judul 	: "Spring in Action",
	harga 	: 360979,
	penulis : "Craig Walls"
}

console.log()
var i;
for (i in buku){
	console.log(buku[i])
}

function aweFun(){
	var a = 2
	var multi = function(){
		console.log(a*2)
	}
}



var total = eval("10*20/2")
console.log(total==="100")


console.log()
console.log(isNaN(200))
console.log(isNaN(100.9))
console.log(isNaN("900"))
console.log(isNaN("False"))

//console.log(a)
//multi()

aweFun()


const person = {
	name: 'Sumagusta',
	pet: {
			name: 'Suma'
	}
};

console.log(person.pet.name)
console.log()
console.log()
console.log()

function foo1()
{
	return {
		salam: "Hai"
	};
}

function foo2()
{
	return
	{
		salam: "Hai"
	};
}

console.log(foo1())
console.log(foo2())