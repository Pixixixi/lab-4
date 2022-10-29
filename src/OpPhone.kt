
fun main()
{
    println("Введите информацию в 1-й класс")
    val OpPhoneInfo: OpPhoneInfo = OpPhoneInfo(readLine().toString(),readLine().toString(),readLine().toString())
    println("Вывод информации 1-го класса")
    OpPhoneInfo.OpInfo()
    println("Введите информацию во 2-й класс")
    val Qp: SecondFormula = SecondFormula(readLine().toString(),readLine().toString(),readLine().toString())
    println("Вывод информации 2-го класса")
    Qp.OpInfo()

}