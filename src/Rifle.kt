class Rifle(
    municion: Int,
    tipoDeMunicion: String,
    danio: Int,
    radio: TipoRadio
):ArmaDeFuego("Rifle", municion, 2, tipoDeMunicion) {
    init {
        require(danio in 5..10){"Tiene que tener daño entre 5 y 10"}
        require(radio in listOf(TipoRadio.CORTO, TipoRadio.INTERMEDIO)) {"Radio tiene que ser o CORTO o INTERMEDIO"}
    }
    override var danio:Int = danio
        set(value) {
            require(value in 5..10){"Tiene que tener daño entre 5 y 10"}
            field = value
        }
    override var radio: TipoRadio = radio
        set(value) {
            require(value in listOf(TipoRadio.CORTO, TipoRadio.INTERMEDIO)) {"Radio tiene que ser o CORTO o INTERMEDIO"}
            field = value
        }
}