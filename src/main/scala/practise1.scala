import scala.annotation.tailrec
class emp{
  var id:Int=0
  var n:String=""
  def this(n:String){
    this()
    this.id=emp.gen
    this.n=n
    println(id+" "+n)
  }

}
object emp{
  private var id=100
  def gen(): Int ={
    id+=1
    id
  }

}
object fun {
  def main(args: Array[String]): Unit = {
    var a1=new emp("divya")
    var a2=new emp("ramya")
    var a3=new emp("divya")
    var a4=new emp("ramya")

   print(GCD(8))
    println(a(7))
  }
  def GCD(n:Int):Int= {
    @tailrec def gcd(acc:Int,n: Int): Int = {
      if (n == 1)
        acc
      else
        gcd(n*acc,n - 1)

    }
    gcd(1,n)
  }
  def a(n:Int): Int ={
    b(n)+n
  }
  def b(n:Int):Int={
    n*n
  }

}
