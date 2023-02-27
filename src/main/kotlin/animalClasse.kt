class Animal(var especie: String) {

    private var fala : String? = null

    init {
        fala = if (especie == "gato") {
            "miau"
        } else if (especie == "cachorro"){
            "auau"
        } else {
            "especie não localizada"
        }
    }

    fun falar(){
        println(fala)
    }

}

fun main() {
    Animal("cachorro").falar()
}