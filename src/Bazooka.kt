class Bazooka(
    municion: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: TipoRadio
):ArmaDeFuego("Bazooka", municion, 3, tipoDeMunicion) {
    init {
        require(danio in 10..30){"Tiene que tener daño entre 10 y 30"}
        require(radio in listOf(TipoRadio.INTERMEDIO, TipoRadio.ENORME)) {"Radio tiene que ser o ENORME o INTERMEDIO"}
    }
    override var danio:Int = danio
        set(value) {
            require(value in 10..30){"Tiene que tener daño entre 10 y 30"}
            field = value
        }
    override var radio: TipoRadio = radio
        set(value) {
            require(value in listOf(TipoRadio.INTERMEDIO, TipoRadio.ENORME)) {"Radio tiene que ser o ENORME o INTERMEDIO"}
            field = value
        }
}