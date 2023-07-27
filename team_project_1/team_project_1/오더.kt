import java.math.BigDecimal

class Order {
    var totalCost: BigDecimal = BigDecimal.ZERO
    val items: MutableList<MenuItem> = mutableListOf()

    fun checkOut(paymentManager: PaymentManager) {
        if (items.isEmpty()) {
            println("주문이 비어 있습니다. 주문을 먼저 추가해주세요.")
            return
        }

        println("[ 주문 내역 ]")
        for ((index, item) in items.withIndex()) {
            println("${index + 1}. ${item.name} | ${item.price}원")
        }
        println("총액: $totalCost 원")

        if (paymentManager.checkBalance(totalCost)) {
            paymentManager.deductAmount(totalCost)
            println("[ 구매한 메뉴 ]")
            for (item in items) {
                println("${item.name} | ${item.price}원")
            }
            println("구매가 완료되었습니다. 잔액: ${paymentManager.balance}원")
            items.clear()
            totalCost = BigDecimal.ZERO
        } else {
            println("잔액이 부족합니다. 구매를 진행할 수 없습니다.")
            println("주문 내역이 초기화됩니다.")
            items.clear()
            totalCost = BigDecimal.ZERO
        }
    }

    fun deleteItem(index: Int) {
        if (index >= 0 && index < items.size) {
            val removedItem = items.removeAt(index)
            totalCost -= removedItem.price
            println("${removedItem.name}을(를) 주문에서 제외합니다.")
        } else {
            println("유효하지 않은 주문 번호입니다. 다시 선택해주세요.")
        }
    }

    fun addItem(item: MenuItem, paymentManager: PaymentManager) {
        if (totalCost + item.price <= paymentManager.balance) {
            items.add(item)
            totalCost += item.price
            println("${item.name}을(를) 선택하셨습니다. 가격 : ${item.price} 주문에 추가합니다.")
        } else {
            println("예산을 초과하여 주문할 수 없습니다.")
        }
    }
}
