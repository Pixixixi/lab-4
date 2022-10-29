
open class OpPhoneInfo(nameOp : String, coyntminutes:String, pok:String)

{
    val operator_name: String
    val coyntminutesop : String
    val ploshad_pokritia: String
    init
    {
        operator_name = nameOp
        coyntminutesop = coyntminutes
        ploshad_pokritia = pok

    }
    fun OPFormul(): Int
    {
        var q: Int = 100*coyntminutesop.toInt()*ploshad_pokritia.toInt()
        return q
    }
    open fun OpInfo()
    {
        println("Название оператора: ${operator_name} ")
        println("Частота стоимость 1 минуты разговора: ${coyntminutesop} ")
        println("Объем площадь покрытия: ${ploshad_pokritia}")
        println("Формула 1: ${OPFormul()}")

    }


}