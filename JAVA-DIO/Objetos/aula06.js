class Pessoa {
    nome;
    peso;
    altura;

    constructor(nome, peso, altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    calcularImc() {
        return this.peso / (this.altura * this.altura);
    }
}

const pessoa = new Pessoa('João', 70, 1.75);
const imc = pessoa.calcularImc();
const vitor = new Pessoa('Vitor', 93, 1.75);
console.log(vitor.calcularImc());

console.log(`O IMC de ${pessoa.nome} é: ${imc}`);
