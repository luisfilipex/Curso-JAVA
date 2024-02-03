class Pessoa {
    nome;
    idade;
    anoNascimento;

    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
        this.anoNascimento = 2024 - idade;
    }

    descrever(){
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade} e você nasceu em ${this.anoNascimento}`);
    }
}

const luis = new Pessoa('Luis', 29);


const pedro = new Pessoa('Joao', 36);


luis.descrever();
pedro.descrever();