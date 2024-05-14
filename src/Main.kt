fun main() {
    println("Hello World!")
    var person = person("Morin", 30, "Kenya")
    person.details()
    var rectangle = rectangle(12, 50)
    rectangle.calculateArea()
    var car = car("porche", "panrema", 2004)
    car.displayCar()

    val myAccount = BankAccount("123456789", 1000.0, "John Doe")

    myAccount.deposit(500.0)
    myAccount.checkBalance()

    myAccount.withdraw(200.0)
    myAccount.checkBalance()
}





//1. Write a Kotlin program that creates a class 'Person' with properties for name, age, and country.
// Include a function to print the person's details.
class person(var name:String, var age:Int, var country:String) {
   fun details(){
       println("name:$name")
       println("age :$age")
       println("country: $country")
    }
}
//2. Write a Kotlin program that creates a class 'Rectangle' with properties for width and height.
// Include a function to calculate the rectangle area.
class rectangle(var width:Int, var height:Int) {
    fun calculateArea() {
        var area = width * height
        println(area)
    }
}
//3. Write a Kotlin program that creates a class 'Car' with properties for make, model, and year.
// Include a function to display car information.
class car(var make:String, var model:String, var year:Int) {
    fun displayCar() {
        println("make: $make")
        println("model: $model")
        println("year: $year")
    }
}
//4. Write a Kotlin program that creates a class 'Student' with properties for name, age, and grade.
// Include a function to check if the student is eligible for promotion.


 //**Bank Accounts Management**: You can create a `BankAccount` class that contains properties like `accountNumber`,
// `balance`, `owner`, and methods like `deposit()`, `withdraw()`, and `checkBalance()`. This can help manage multiple
// bank accounts and their transactions.

class BankAccount(
    val accountNumber: String,
    var balance: Double,
    val owner: String
) {
    fun deposit(amount: Double) {
        balance += amount
        println("$amount deposited successfully into account $accountNumber")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("$amount withdrawn successfully from account $accountNumber")
        } else {
            println("Insufficient funds in account $accountNumber")
        }
    }

    fun checkBalance() {
        println("Current balance in account $accountNumber: $balance")
    }
}


