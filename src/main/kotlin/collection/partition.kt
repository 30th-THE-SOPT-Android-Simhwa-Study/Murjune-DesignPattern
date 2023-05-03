package collection

// filter와 partition의 차이
// filter는 조건에 맞는 element를 모두 반환하지만, partition은 조건에 맞는 element와 조건에 맞지 않는 element를 각각 반환합니다.
// 따라서 partition은 조건에 맞는 element와 조건에 맞지 않는 element를 각각 반환하기 때문에, 반환되는 값이 Pair로 반환됩니다.
// Pair의 first는 조건에 맞는 element를, second는 조건에 맞지 않는 element를 반환합니다.

fun main() {
    // partition
    val li = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val (odd, even) = li.partition { it % 2 == 0 }
    println(odd) // [2, 4, 6, 8]
    println(even) // [1, 3, 5, 7, 9]
    // filter, notFilter
    val odd2 = li.filter { it % 2 == 0 }
    println(odd2) // [2, 4, 6, 8]
    val even2 = li.filterNot { it % 2 == 0 }
    println(even2) // [1, 3, 5, 7, 9]
}