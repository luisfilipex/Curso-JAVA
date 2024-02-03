const combustivel = 5.79;
const consumo = 12;
const km = 1589;

const litros = km / consumo;
const valor = litros * combustivel;

console.log("Seu gasto será: R$" + valor.toFixed(2));


