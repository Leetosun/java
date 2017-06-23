import proxy.Proxy
import proxy.RealSubject

/**
 * Created by LeeToSun on 2017/6/23
 */
fun main(args: Array<String>) {
//    val proxy = Proxy(RealSubject())
//    proxy.request()
//    var b = Bean2(1,"张三",25)
//    println(b.id)

    val arr: IntArray = intArrayOf(35, 5, 86, 13, 84)
//    var arr2 = Array(5, { (4) })
    for (i in 0..arr.size - 2) {
        for (j in 0..arr.size - 2) {
            if (arr[j] > arr[j + 1]) {
                val t = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = t
            }
        }
    }
    for (i in arr.indices) {
        println(arr[i])
    }
}

class Bean2(var id: Int, var name: String, var age: Int)