package pract1

class Spending (var sum: Int, var category: String, var date: String){
    fun getSpending(){
        println("Сумма: $sum Категория: $category Дата: $date")
    }
}