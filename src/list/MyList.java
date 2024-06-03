package list;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marcos");

        System.out.println(list.size());
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        /*Tradução do código acima, remove todo o string x (tal que) nesse 
         * String x, o charAt(0), ou seja, o primeiro caractere, seja igual
         * a letra M
         */
        for(String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------------");
        /*Agora para encontrar a posição de um elemento */
        System.out.println("Index of Bob");
        list.indexOf("Bob");
        System.out.println("----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        /*Explicação dessa linha gigantesca acima, primeiramente, é necessário
         *criar uma nova lista, e atribuir a ela o valor dessa busca da lista
         *anterior, eu vou chamar a lista que desejo filtrar, ou seja, nesse
         caso é list, então vou fazer list.stream(), esse stream, é um tipo especial
         que aceita operações do tipo lambdha, e a partir desse stream, vou chamar, a fução filter
         que recebe um predicado(condição), que é bem parecido com o que fiz anteriormente, que vai filtrar
         a lista, com base na condição filter(x -> x.charAt(0) == 'A'), porém, tudo isso ainda não resolve
         pois o stream(), não é compativel com o tipo list, sendo assim, eu tenho que pegar o strem() e converter ele 
         novamente para lista. e para isso eu preciso chamar a a função collect(Collector.toList())
         */
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("----------------------------");
        /*Vou fazer um comando para encontrar o primeiro elemento que atender a uma caracteristica que vou definir
         * pelo predicado
         */
        String name = list.stream().filter(x -> x.charAt(0) =='A').findFirst().orElse(null);
        /*O que acontece nessa primeira linha ?, basicamente quase a mesma que anteriormente, porém, se chama a função findFirst, que é para ele encontrar 
         * o primeiro elemento que atende a essas caracteristicas, e caso não encontre, é necessário chamar a função orElse(null), foi atribuida nos parenteses
         * o valor null, ou seja, ela vai retornar essa informação caso não seja encontrado o elemento cujo minha condição ou predicado não seja atendido.
         */
        System.out.println(name);
    }
}
