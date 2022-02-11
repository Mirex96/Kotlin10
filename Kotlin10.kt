// 10. Написать функцию которая принимает на вход две строки и возвращает Boolean, в зависимости от того, равны или нет
fun main() {
    val str1 = "Money"
    val str2 = "A lot of money"
    println(comparison(str1, str2))
}

fun comparison(str1: String, str2: String): Boolean {
    return str1 == str2
}