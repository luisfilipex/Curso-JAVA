const precoEtanol = 3.40;
const precoGasolina = 5.79;
const km = 10;
const distancia = 1250;
const combUsado = 'Etanol';

const qtd = distancia / km;
let valor;

if (combUsado === 'Etanol') {
    valor = qtd * precoEtanol;
} else {
    valor = qtd * precoGasolina;
}

console.log("O valor gasto foi de: R$" + valor.toFixed(2));
