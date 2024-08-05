package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    private static class Holder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        // Construtor privado para evitar instância externa
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.INSTANCE;
    }
}
