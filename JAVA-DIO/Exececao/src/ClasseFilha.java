public class ClasseFilha extends Exception {
    ClasseNeta classeNeta;

    public void executar() throws Exception {
        classeNeta = new ClasseNeta();
        classeNeta.executar();
    }
}














