package arvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    private Node<T> root;

    private static class Node<T> {
        T data;
        Node<T> left, right;

        Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    public void inserir(T data) {
        root = inserirRec(root, data);
    }

    private Node<T> inserirRec(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = inserirRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = inserirRec(root.right, data);
        }
        return root;
    }

    public void remover(T data) {
        root = removerRec(root, data);
    }

    private Node<T> removerRec(Node<T> root, T data) {
        if (root == null) return root;

        if (data.compareTo(root.data) < 0) {
            root.left = removerRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = removerRec(root.right, data);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.data = minValue(root.right);
            root.right = removerRec(root.right, root.data);
        }
        return root;
    }

    private T minValue(Node<T> root) {
        T minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public void exibirInOrdem() {
        exibirInOrdemRec(root);
    }

    private void exibirInOrdemRec(Node<T> root) {
        if (root != null) {
            exibirInOrdemRec(root.left);
            System.out.print(root.data + " ");
            exibirInOrdemRec(root.right);
        }
    }

    public void exibirPreOrdem() {
        exibirPreOrdemRec(root);
    }

    private void exibirPreOrdemRec(Node<T> root) {
        if (root != null) {
            System.out.print(root.data + " ");
            exibirPreOrdemRec(root.left);
            exibirPreOrdemRec(root.right);
        }
    }

    public void exibirPosOrdem() {
        exibirPosOrdemRec(root);
    }

    private void exibirPosOrdemRec(Node<T> root) {
        if (root != null) {
            exibirPosOrdemRec(root.left);
            exibirPosOrdemRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
