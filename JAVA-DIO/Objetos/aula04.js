class Pessoa {
    nome;
    idade;
    anoNascimento;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
        this.anoNascimento = 2024 - idade;
    }

    descrever() {
        console.log(`Meu nome é ${this.nome}, minha idade é ${this.idade} e eu nasci em ${this.anoNascimento}`);
    }
}

const luis = new Pessoa('Luis', 29);
const pedro = new Pessoa('Pedro', 19);

luis.descrever();
pedro.descrever();

function compararPessoa(p1, p2) {
    if (p1.idade > p2.idade) {
        console.log(`${p1.nome} é mais velho que ${p2.nome}`);
    } else if (p2.idade > p1.idade) {
        console.log(`${p2.nome} é mais velho que ${p1.nome}`);
    } else {
        console.log(`${p1.nome} tem a mesma idade que ${p2.nome}`);
    }
}

compararPessoa(luis, pedro);
