package dataStructures

// Existem muitas vantagens da lista encadeada em relação aos arrays
// Uma lista encadeada é uma "corrente de nodos" (chain of nodes)

class Planet(name: String){}

val uranus = Planet("Uranus")
val neptune = Planet("Neptune")
val pluto = Planet("Pluto")

fun main() {
    val list = listOf(1, "2", 3.0, 4.0f, "5", 6)
    val list2 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list3 = listOf<String>("1", "2", "Danilo", "Araujo", "Volles")

    println(list)

    val planets = mutableListOf<Planet>(uranus, neptune, pluto)
    // Ops, Plutão não é planeta: em uma lista mutável podemos remover
    // Quando acessamos um elemento em uma mutableList nós na verdade acessamos um ponteiro
    // Esse ponteiro armazena o endereço de memória em que se encontra armazenado o item da lista

    println(planets)

    planets.remove(pluto)

    println(planets)
}