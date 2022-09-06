package pe.edu.ulima.pm.miprimeraapp

open class Person(var name: String, var  age: Int)
abstract class Person2(var name: String, var  age: Int)
data class Person3(var name: String, var  age: Int)

class Developer(name: String) : Person(name, 10) //Los objetos de la clase Developer tendrán los atributos 'name' y 'age'(valor 10 fijo)

fun main(): Unit {
    val p = Developer("JhordyLS")
    val p2 = Person3("Joel", 25)
    var list = listOf(1, 2, 3, 4, 5)
    var list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    for(x in list) {
            println(x)
    }
    for(i in 0..(list.size-1)) {
        print(list[i])
    }
    for(i in 0 until list.size) { // until: cerrado por la der del list.size
        print(list[i])
    }
    when(p.age) {
        in 0..10 -> println("10") //el 0 y 10 tmb se consideran
        in 15..20 -> println("20")
        else -> println("\nnot found")
    }
    val res = if(p.age > 10) true else false
    val result = when(p.age) {
        in 0..10 -> 10
        in 15..20 -> 20
        else -> -1
    }
    list2.add(6)
    val list3 = list2 + 7

    println(p)
    println(p2)
    println(p.name)
    println(p.age)
    println(res)
    println(result)
    println(list3.size)
}

/* Int, Long, Double, Float, String */
fun sum(a: Int, b: Int): Int {
    return a + b
}



