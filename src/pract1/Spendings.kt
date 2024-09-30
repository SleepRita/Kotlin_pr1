package pract1

class Spendings {
    var spendings = mutableListOf<Spending>()

    fun new_spending(sum: Int, category: String, date: String)
    {
        spendings.add(Spending(sum, category, date))
    }

    fun show_spendings(){
        spendings.forEach{
            it.getSpending()
        }
    }

    fun sum_spendings(){
        var s = mutableMapOf(spendings[0].category to spendings[0].sum)
        spendings.forEach{
            if (it.category in s){
                s[it.category] = s[it.category]!! + it.sum
            }
            else{
                s[it.category] = it.sum
            }
        }
        s[spendings[0].category] = s[spendings[0].category]!! - spendings[0].sum
        for (l in s){
            println(l)
        }
    }
}