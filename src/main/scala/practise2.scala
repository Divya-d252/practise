import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn._
import scala.util.matching.Regex
object hola {
  def main(args: Array[String]): Unit = {

    println("check-merge")

    println("master")

    println("feature-d")
    println("change made")
    var a:ArrayBuffer[Int]=ArrayBuffer(1,2,3,5,3,3)
    a=a.distinct
    a.insert(2,9)
    a.foreach(println)
    a.remove(1,2)
    a.foreach(println)
    var s="divya"
    var c=s.charAt(2)
    println(c)
    var aa=readLine("Hello Divya..Please Enter ")

    println(s.indexOf("y"),s.endsWith("va"))
    var c1=readInt()
    println("dvs  d d"+c1)
    println("this".intersect("sffshisg"))
    var x=("((r.m|div|\\d|\\w)ya)").r

    var z="\\za".r
    var k="y".r
    var y="se gramyaddddddddddgyayaramyadivya"
    println(x.findFirstIn(y))
    println(z.findFirstIn(y))
    println(k replaceAllIn(y,"q"))
    println(z.findAllIn(y).mkString(","))
    var m1="\\d".r
    var m2="dhsfcjhm3hhh23bbvhgb92gvvfd4"
    println(m1.replaceAllIn(m2,"x"))
    println(aa)
    for( row <- 1 to 3; col<-5 to 7 ) { print(row); print(col); print("\t"); }


  }

}
