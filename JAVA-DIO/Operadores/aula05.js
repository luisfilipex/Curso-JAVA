/*
1 - a vista debito, recebe 10% de desconto;
2 - a vista no dinheiro ou pix,recebe 15% de desconto;
3 - em duas vezes, precos normal de etiqueta sem juros;
4 - acima de duas vezes, preco normal de etiqueta mais juros de 10%;

*/


const precoEtiqueta = 100;
const formaDePagamento = 4;

if(formaDePagamento === 1){
    console.log(precoEtiqueta - (precoEtiqueta * 0.1)) 
}else if(formaDePagamento === 2){
    console.log(precoEtiqueta - (precoEtiqueta * 0.15))
}else if(formaDePagamento === 3){
    console.log(precoEtiqueta);
}else if(formaDePagamento === 4){
    console.log(precoEtiqueta + (precoEtiqueta * 0.1));
}