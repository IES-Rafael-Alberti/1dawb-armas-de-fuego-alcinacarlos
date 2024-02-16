import kotlin.random.Random

abstract class ArmaDeFuego(
    private val nombre: String,
    private var municion: Int,
    private val municionARestar: Int,
    private val tipoDeMunicion: String
) {
    abstract var danio: Int
    abstract var radio: TipoRadio

    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5, 16)
    }
    fun dispara(){
        if (municion>=municionARestar){
            municion -= municionARestar
            println("$nombre ha disparado")
        }else if (cantidadMunicionExtra>=municionARestar){
            recargar()
            dispara()
        }else{
            println("No hay suficiente munición para disparar.")
        }
    }
    private fun recargar(){
        if (cantidadMunicionExtra >= municionARestar * 2){
            cantidadMunicionExtra -= municionARestar * 2
            municion += municionARestar * 2
        }else if (cantidadMunicionExtra >= municionARestar){
            cantidadMunicionExtra -= municionARestar
            municion += municionARestar
        }else{
            println("No hay suficiente munición extra para recargar.")
        }
    }

    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: ${radio.desc}"
    }
}