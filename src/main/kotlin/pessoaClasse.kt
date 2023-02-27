// criação da classe e caracteristicas obrigatorias no construtor
class Pessoa(var nome: String, var peso: Float, val anoNascimento: Int) {

    // caracteristicas que vou acessar apos passar dados pelo segundo construtor
    var tipoCabelo: String? = null
    var corOlhos: String? = null
    var corPele: String? = null
    var altura: String? = null

    // atributos opcionais usando segundo construtor
    constructor(
        nome: String,
        peso: Float,
        anoNascimento: Int,
        tipoCabelo: String,
        corOlhos: String,
        corPele: String,
        altura: String
    ) : this(
        nome,
        peso,
        anoNascimento
    ) {
        this.tipoCabelo = tipoCabelo
        this.corOlhos = corOlhos
        this.corPele = corPele
        this.altura = altura
    }


    //metodos, atividades que minha classe executa
    fun comer() {

    }

    fun estado(horario: Int) {
        when (horario) {
            in 7..8 -> {
                println("Acordando")
            }

            in 8..22 -> {
                println("Acordado")
            }

            else -> {
                println("Dormindo")
            }
        }
    }

}

fun main() {
    // instaciar meu objeto, criar nova pessoa
    val pessoa = Pessoa("Volnei", 65.0f, 1998)

    //acessar metodos e caracteristicas da minha classe instanciada

    pessoa.estado(9)
}