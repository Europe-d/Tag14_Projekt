import kotlin.math.*

fun main(){

    xP(4.2,6.5)
    xP(12.56,3.56)
}


fun xP(x1:Double,x2:Double) {


    var fd1 = (x1 * x1 )+( x2 * x2)
    var fd = sqrt(fd1)

    println("Die kleine Zahl ist $fd")


    println("ist $fd.")

}
    /*hypot
Common
JVM
JS
Native
1.2
fun hypot(x: Double, y: Double): Double
(Common source) (JVM source) (JS source) (Native source)
fun hypot(x: Float, y: Float): Float
(Common source) (JVM source) (JS source) (Native source)
Computes sqrt(x^2 + y^2) without intermediate overflow or underflow.

Special cases:

returns +Inf if any of arguments is infinite
returns NaN if any of arguments is NaN and the other is not infinite*/
