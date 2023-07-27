import java.math.BigDecimal

abstract class MenuItem(var name: String, var price: BigDecimal, var explain: String)

class Burger(name: String, price: BigDecimal, explain: String) : MenuItem(name, price, explain)
class IceCream(name: String, price: BigDecimal, explain: String) : MenuItem(name, price, explain)
class Drink(name: String, price: BigDecimal, explain: String) : MenuItem(name, price, explain)

class PaymentManager(initialBalance: BigDecimal) {
    var balance: BigDecimal = initialBalance

    fun checkBalance(price: BigDecimal): Boolean {
        return balance >= price
    }

    fun deductAmount(price: BigDecimal) {
        balance -= price
    }
}
