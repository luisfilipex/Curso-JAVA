const numeros = [1, 2, 5, 6, 10, 16, 8, 22, 30, 32];

for (let i = 0; i < numeros.length; i++) {
    const numeroAtual = numeros[i];
    if (numeroAtual % 2 === 0) {
        console.log(numeroAtual);
    }
}
