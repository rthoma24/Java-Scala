package main.scala

/**
 * @author rthoma24
 *Mar 28, 2016
 */

class Rinu {
  
  // just a method
  def methodName(a: String, b: String) {
    println(a.concat(b))
  }
  
  // just a method
  def methodName1(a: String) {
    val c = new String("Inside Method")
    println(a + c )
    val testString: String = a+c
    return testString
  }
  
  //single line method
  val greeting: String = "Good Morning!"
  
  //single line method
  val greeting1: String = "Hello, world!"
  
  
  //main - calling it
  def main(args: Array[String]) {
    methodName("Call method - ","")
  }

}