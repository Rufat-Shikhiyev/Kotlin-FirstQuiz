fun main(){
    val  daire = Circle()
    val  kvadrat = Rectangle()
    val  sfera = Sphera()

    val  array = listOf(daire.calculateArea(4),kvadrat.calculateArea(3),sfera.calculateArea(7),sfera.calculateVolume(6),sfera.getname(),kvadrat.getname(),daire.getname())

    for ( i in array){
        println(i)
    }


}

interface TwoDimensional{
    fun calculateArea(a: Int)
}

interface  ThreeDimensional{

    fun calculateVolume(b : Int)
}


abstract class Shape(){
    abstract fun getname() : String
}

enum class ShapeType(var other : String){
    DAIRE(other = "Daire"),
    KVADRAT(other = "Rectangle"),
    SFERA(other = "Sphera")

}

class Sphera : Shape(),TwoDimensional, ThreeDimensional{

    override fun getname():String {
        return ShapeType.SFERA.other
    }

    override fun calculateArea(a: Int){
        println("Sferanin sahesi: ${a*a*3.14}")
    }

    override fun calculateVolume(b: Int){
        println("Sferanin hecmi : ${b*b*3.14}")
    }
}

class Rectangle : Shape(), TwoDimensional{
    override fun getname() : String {
        return ShapeType.KVADRAT.other
    }

    override fun calculateArea(a: Int) {

        println("Kvadratin Sahesi : ${a*a}")

    }

}

class Circle: Shape(),TwoDimensional{

    override fun getname(): String{
        return ShapeType.DAIRE.other
    }

    override fun calculateArea(a: Int){
        println("Dairenin sahesi : ${a*a*a}")
    }
}