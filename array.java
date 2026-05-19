public class array {
    public static void main(String[] args) {
        
        // Criação de Array com valores fixos
        int [] numeros = {1,2,3,4,5};

        // Acessando o primeiro elemento (indice 0)
        System.out.println(numeros[0]); // Saída: 1

        // Adicionando um elemento ao final do array:
        // como é array de tamanho fixo, precisa criar um novo array
        int [] novoArray = new int[numeros.length + 1];

        // Copiando os elementos antigos
        for (int i = 0; i < numeros.length; i++);{
            novoArray[i] = numeros[i];
        }

        // Adicionando o novo elemento (6)
        novoArray[novoArray.length - 1] = 6;

        // Substituindo o array antigo
        numeros = novoArray;

        // Imprimindo o array atualizado
        System.out.print("Saída: [");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.println(",");
            }
        }
        System.out.println("]");
    }
}
