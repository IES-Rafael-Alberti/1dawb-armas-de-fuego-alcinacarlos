class Pistola(
    municion: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: TipoRadio
):ArmaDeFuego("Pistola", municion, 1, tipoDeMunicion) {
    init {
        require(danio in 1..5){"Tiene que tener daño entre 1 y 5"}
        require(radio in listOf(TipoRadio.CORTO, TipoRadio.REDUCIDO)) {"Radio tiene que ser o corto o reducido"}
    }
    override var danio:Int = danio
        set(value) {
            require(value in 1..5){"Tiene que tener daño entre 1 y 5"}
            field = value
        }
    override var radio: TipoRadio = radio
        set(value) {
            require(value in listOf(TipoRadio.CORTO, TipoRadio.REDUCIDO)) {"Radio tiene que ser o corto o reducido"}
            field = value
        }
}