const peso = 93.0;
const altura = 1.70;
const imc = peso / Math.pow(altura,2);

if(imc < 18.5){
    console.log("Abaixo do Peso")
}else if (imc >= 18.5 && imc < 25) {
    console.log("Peso Normal");
}else if(imc > 25  && imc < 30){
    console.log("Acima do peso")
}else if(imc > 30 && imc < 40){
    console.log("Obesidade Grau 1")
}else if(imc >=40){
    console.log("Obesidade Grau 2")
}