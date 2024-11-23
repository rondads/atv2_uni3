public class atv2_uni3 {
    public static void main(String[] args) {
        // Passo 1: Insira os números [1, 2, 3, 4, 5] em uma lista
        int[] lista = {1, 2, 3, 4, 5};
        int listaTamanho = lista.length;

        // Passo 2: Remova os dados da lista e insira-os em uma pilha
        int[] pilha = new int[listaTamanho];
        int pilhaTopo = -1; // Índice do topo da pilha

        for (int i = 0; i < listaTamanho; i++) {
            pilha[++pilhaTopo] = lista[i]; // Adiciona na pilha
        }

        // Passo 3: Remova os dados da pilha e insira-os em uma fila
        int[] fila = new int[10];
        int filaInicio = 0, filaFim = 0; // Índices da fila

        while (pilhaTopo >= 0) {
            fila[filaFim++] = pilha[pilhaTopo--]; // Remove da pilha e adiciona à fila
        }

        // Passo 4: Insira os números [6, 7, 8, 9, 10] na lista
        lista = new int[]{6, 7, 8, 9, 10};
        listaTamanho = lista.length;

        // Passo 5: Repita os passos 2 e 3
        for (int i = 0; i < listaTamanho; i++) {
            pilha[++pilhaTopo] = lista[i]; // Adiciona na pilha
        }
        while (pilhaTopo >= 0) {
            fila[filaFim++] = pilha[pilhaTopo--]; // Remove da pilha e adiciona à fila
        }

        // Passo 6: Exiba todos os números que foram inseridos na fila
        System.out.print("Numeros na fila: ");
        for (int i = filaInicio; i < filaFim; i++) {
            System.out.print(fila[i] + " ");
        }
    }
}
// Resposta: Os números não aparecem na mesma ordem em que foram inseridos na lista (1 a 5, e depois, 6 a 10, ambos de forma crescente).
// Essa alteração ocorre devido ao modo como a Pilha (Stack) opera, seguindo o conceito LIFO (Last In, First Out), que inverte a ordem dos números inseridos.
// O número 1, que é o primeiro a entrar na lista, se torna o fundo da pilha, enquanto o número 5, que entra por último, fica no topo.
// Quando os números são movidos da pilha para a fila, o número 5, por estar no topo da pilha, é o primeiro a ser adicionado à fila, e assim por diante.

// Como resultado, os números da primeira metade do código aparecem na ordem: 5, 4, 3, 2, 1.
// O mesmo processo se aplica na segunda metade (Passos 4, 5 e 6), resultando nos números: 10, 9, 8, 7, 6.
