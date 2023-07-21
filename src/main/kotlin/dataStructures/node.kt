package dataStructures

// O nó é uma estrutura auxiliar que armazena não só o dado, mas também o endereço da próxima
// estrutura da lista. O array deve ser armazenado juntinho, então não é necessário a criação
// de nós para a estrutura

// No caso das linked Lists, precisamos dos nós por que vamos armazenar
// os dados em diferentes espaços da memória, logo, precisamos do endereço
// do próximo item para podermos acessá-lo.

// Nós são como vagões de trem -> eles existem independentemente um do outro, mas possuem ganchos
// ara se conectarem uns aos outros em ordem.

// No último nó não terá informação sobre um próximo nó, então é identificado o último item

class Node(data: Any) {
    var next: Node? = null
    var data: Any = data
}

fun node() {
    var node1 = Node(5)
    var node2 = Node(9)

    println(node1.data)
    println(node2.data)

    node1.next = node2
    println(node1.next)
    println(node2.next)
}

fun main() {
    node()
}