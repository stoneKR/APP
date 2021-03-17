import java.io.BufferedReader
import java.io.FileReader

fun main(args : Array<String>) {
    // java와 흡사하다. 그러나 checked excpetion을 지원 안 함
    // 즉, try catch를 강제적으로 할 필요가 없다는 말임
    // 그것보다는 알아서 방어코드를 만들라는 것이 kotlin 철학임
    try{
        13 / 0
    } catch (e: Exception){
        println(e)
    } finally {
        println("마지막 수행.")
    }
    var zerodivided = 13 / 0
    println(zerodivided)
}
// try catch를 강제하지 않았을 뿐, 방어코드는 필요하다.
fun no_checked_exception() {
    // java 코드 자동 컨버팅
//     try {
//          val 'in' = BufferedReader(FileReader(args[0]))
//          val s: String?
//
//          s = 'in'.readLine()
//          while (s != null) {
//              println(s)
//              s = 'in'.readLine
//          }
//          'in'.close()
//      } catch (e: IOException) {
//          System.err.println(e) // 에러가 있다면 메세지 출력
//          System.exit(1)
//      }
//
    // kotlin은 try .. catch문을 반드실 할 필요가 없다. checked exception을 지원 안 함!!
    val 'in' = BufferedReader(FileReader("D:\\workspace\\app\\Test\\src"))
    var s: String?
    s = 'in'.readLine()
    while (s != null) {
        println(s)
        s = 'in'.readLine()
    }
    'in'.close()
}
