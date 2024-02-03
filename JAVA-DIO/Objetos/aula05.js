class Carro {
    marca;
    cor;
    gastoMedioPorKm;

    constructor(marca, cor, gastoMedioPorKm) {
        this.marca = marca;
        this.cor = cor;
        this.gastoMedioPorKm = gastoMedioPorKm;
    }

    calcularGastoViagem(distanciaEmKm, precoCombustivel) {
        return (distanciaEmKm * this.gastoMedioPorKm * precoCombustivel).toFixed(2);
    }
}

const uno = new Carro('Fiat', 'Prata', 1/12);
uno.calcularGastoViagem(70, 5.89);
console.log(uno.calcularGastoViagem(70, 5));

const palio = new Carro('Fiat', 'Preto', 1/10);
const resultadoPalio = palio.calcularGastoViagem(70, 5);
console.log(resultadoPalio);
