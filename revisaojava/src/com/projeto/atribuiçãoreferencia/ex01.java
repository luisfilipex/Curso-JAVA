package com.projeto.atribuiçãoreferencia;

class ex01 {
    private int num;

    public ex01(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
