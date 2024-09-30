package pract1

fun main() {
    val my_spend = Spendings()
    println("Памятка:\nДобавить новый расход - 'New spending: {сумма}, {категория}, {дата}'" +
            "\nВывести список расходов - 'My spendings'" +
            "\nВывести сумму расходов по категориям - 'Sum'" +
            "\nЗавершить выполнение программы - 'End'")

    while (true){
        var comm = readln().split(": ")
        if (comm[0] == "New spending"){
            comm = comm[1].split(", ")
            try {
                my_spend.new_spending(comm[0].toInt(), comm[1], comm[2])
            } catch (e: IndexOutOfBoundsException ){
                println("Uncorrect command!")
            } catch (e: NumberFormatException ){
                println("Uncorrect command!")
            }

        }
        else if (comm[0] == "My spendings"){
            my_spend.show_spendings()
        }
        else if (comm[0] == "Sum"){
            my_spend.sum_spendings()
        }
        else if (comm[0] == "End"){
            break
        }
        else{
            println("Unknown command!")
        }
    }
}