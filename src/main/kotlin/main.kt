package ru.netology
fun main() {
   val sum = 11000
    var customer: Boolean = true
   if (sum<1000 && sum>0) {
       println("Скидок нет")
   }
   else if (sum> 1001 && sum<10000) {
       println(sum-100)
   }
   else {
       println(sum - sum*0.05)
   }
    if (customer==true) {
        println((sum - sum*0.05)-(sum - sum*0.05)*0.01)
    }
}




