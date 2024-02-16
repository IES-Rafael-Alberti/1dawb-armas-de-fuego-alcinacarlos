fun main(){
    val armas = listOf(
        Pistola(15, "9nm", 3, TipoRadio.CORTO),
        Rifle(10, "7.62nm", 10, TipoRadio.INTERMEDIO),
        Bazooka(3, "Cohete", 30, TipoRadio.ENORME)
    )
    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")
    val disparos = (1..12).map { armas.random() to (1..3).random() }
    disparos.forEach { (arma, disparos) ->
        println("** Disparos de $arma ($disparos): **")
        repeat(disparos) {
            arma.dispara()
            println(arma)
        }
    }
}