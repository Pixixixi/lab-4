
class SecondFormula(nameOp : String, coyntminutes:String, pok:String): OpPhoneInfo(nameOp,coyntminutes,pok)
{
    val P: Boolean = true
    var Qp: Double = 0.0
    init {

    }

    fun QpForm(): Double
    {
        if (P == true) {
            Qp = Qp + OPFormul() * 0.7
        }
        else if (P == false)
        {
            Qp = 1.5 * OPFormul()
        }
        return Qp

    }
    override fun OpInfo()
    {
        super.OpInfo()
        println("Формула 2: ${QpForm()}")
    }


}