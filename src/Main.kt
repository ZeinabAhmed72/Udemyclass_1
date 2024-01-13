
fun main() {
    val firstName2:String ="Ahmed"
//firstName2 = "Ali"
    println(firstName2.isEmpty())

    val myAge:Int = 30
//myAge = 66
    println(myAge)

    println("===============")

    var firstName = "Zeinab"
    firstName = "Hassan"
println(firstName.isEmpty())

    var lastName= "Ahmed"
    println(lastName)

    var age = 28
    println(age)

    println("===========")
    var car:String = "BMW"
    println(car)
    var number:Int = 34
    println(number)
    println("===============")

    val myByte:Byte = 8
    val myShort:Short = 16
    val myInt:Int = 32
    val myLong:Long = 64
    //decimal
    val myFloat:Float = 32.00F
    val myDouble:Double = 64.00

    println(myByte::class)
    println(myByte.toLong())
    println(myByte.toLong()::class)

    println("======================")

    //Package  datatype
     val str:String = "Hello World"
    println(str)
    println(str.uppercase())
    println(str.lowercase())

    val aChar:Char = 'A'
    println(aChar)
    println('\n')
    println('\uFF00')




}