const pessoa = {
    nome: 'Luis Filipe',
    idade: 29,
    descrever: function (){
        console.log(`Meu nome e ${this.nome} e minha idade e ${this.idade} anos`);
    }
};

pessoa.descrever();