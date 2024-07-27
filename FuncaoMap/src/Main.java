public class Main {
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Luis", 981676241);
        agendaContato.adicionarContato("Guilherme", 981676246);
        agendaContato.adicionarContato("Lucas", 981646249);
        agendaContato.adicionarContato("Mariana", 981676249);
        agendaContato.adicionarContato("Pedro", 981678249);
        agendaContato.adicionarContato("Rogerio", 981676251);
        agendaContato.adicionarContato("Joaquim", 981676241);

        agendaContato.exibirContato();
        agendaContato.removerContato("Joaquim");
        agendaContato.exibirContato();

        System.out.println("O número é: " + agendaContato.pesquisarPorNome("Luis"));
    }
}
