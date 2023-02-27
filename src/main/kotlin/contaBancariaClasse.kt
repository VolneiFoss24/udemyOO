enum class Operacoes {
    extrato, deposito, saque, transferencia
}

class FossBank() {
    var conta = 0
    var nome = ""
    private var saldo = 0.0

    init {
        println("Bem vindo ao nosso banco!")
    }

    fun operacoes(operacoes: Operacoes){
        when(operacoes){
            Operacoes.extrato -> extrato()
            Operacoes.deposito -> deposito(readln().toDouble())
            Operacoes.saque -> saque(readln().toDouble())
            Operacoes.transferencia -> transferencia( conta = FossBank(), readln().toDouble())
            else -> println("Operação invalida")
        }
    }

    private fun extrato() {
        println(saldo)
    }

    private fun deposito(valor: Double) {
        if (valor > 0) {
            saldo += valor
        } else {
            println("falha na operação")
        }
    }

    private fun saque(valor: Double) {
        if (saldo > valor) {
            saldo -= valor
        } else {
            println("falha na operação, valor insuficiente")
        }
    }

    private fun transferencia(conta: FossBank, valor: Double) {
        if (valor > 0 ) {
            conta.saldo += valor
            this.saldo -= valor
        } else {
            println("Transferencia não realizada")
        }
    }
}

fun main() {

    val contaVolnei = FossBank()
    contaVolnei.operacoes(Operacoes.extrato)

}