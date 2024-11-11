import java.io.BufferedReader
import java.io.InputStreamReader

private var max = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    max = n
    println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    /*println("""
            "재귀함수가 뭔가요?"
            "잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
            마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
            그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
        """.trimIndent())*/
    recursion(0)
}

fun recursion(n: Int) {
    val sb = StringBuilder().apply {
        repeat(n) {
            append("____")
        }
    }
    if (n <= max) {
        println("${sb}\"재귀함수가 뭔가요?\"")
        if (n < max) {
            println("""
            ${sb}"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
            ${sb}마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
            ${sb}그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
        """.trimIndent())
        } else {
            println("${sb}\"재귀함수는 자기 자신을 호출하는 함수라네\"")
        }
        recursion(n + 1)
        println("${sb}라고 답변하였지.")
    } else {
        return
    }
}