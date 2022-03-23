class Person {
    name = String
}
/*
Usando o método construtor e uma função:
constructor(name) {
    this.name = name;
  }

  introduceSelf() {
    console.log(`Hi! I'm ${this.name}`);
  }
*/
let p1 = new Person()
p1.name = 'Carlos'
console.log(p1.name)