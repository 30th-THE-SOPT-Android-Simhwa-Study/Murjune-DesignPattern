package collection

// Kotlin의 associateWith 및 associateBy는 하나의 컬렉션을 맵으로 변환하는 데 사용되는 함수입니다.

// associateWith 함수는 원래 컬렉션의 각 element를 key값으로 갖고, 각 element를 변환하는 람다의 result값을 value로 갖는 Map으로 변환해줍니다.
// 컬렉션의 element값이 key값이 되고, 람다의 result값이 value값이 되는 것이죠.

// ex) 아래 예시에서는 associateWith()을 통해 변환된 Map은 list의 element를 key값으로 갖고, 람다의 result값인 {it.length}를 value값으로 갖습니다.

// assosiateBy() 함수는 associateWith와 다르게 원래 컬렉션의 각 element를 변환하는 람다의 result값을 key값으로 갖고, 각 element를 value값으로 갖는 Map으로 변환해줍니다.
// 컬렉션의 element값이 value값이 되고, 람다의 result값이 key값이 되는 것이죠.
// ex) 아래 예시에서는 associateBy()을 통해 변환된 Map은 list의 element를 value값으로 갖고, 람다의 result값인 {it.first()}를 key값으로 갖습니다.

// 두 함수 모두 람다의 result값이 중복되는 경우, 마지막에 나온 element가 value값으로 갖게 됩니다.
// List 혹은 Collection을 key로 쉽게 쿼리 할 수 있게 Map으로 변환해주는 함수입니다.
fun main() {
    val list = listOf("apple", "banana", "cherry")
    val map = list.associateWith { it.length }
    println(map) // {apple=5, banana=6, cherry=6}
    val map2 = list.associateBy { it.first() }
    println(map2) // {a=apple, b=banana, c=cherry}
}