const nota1 = 7.0;
const nota2 = 4.0;
const nota3 = 10.0;

const media = (nota1 + nota2 + nota3) / 3;

if (media <= 5) {
    console.log("Reprovado"); 
} else if (media >= 5 && media < 7) {
    console.log("Recuperação"); 
} else if (media >= 7) {
    console.log("Aprovado");
}
