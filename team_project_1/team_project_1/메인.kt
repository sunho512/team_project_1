import java.math.BigDecimal

fun main() {
    val menu = Menu()
    val paymentManager = PaymentManager(BigDecimal("100000"))
    val order = Order()

    while (true) {
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("5. 결제하기         | 주문한 메뉴를 결제합니다.")
        println("0. 종료            | 프로그램 종료")

        print("메뉴를 선택해주세요: ")
        val selectedMenu = readLine()?.toIntOrNull() ?: -1

        when (selectedMenu) {
            0 -> {
                println("프로그램을 종료합니다.")
                return
            }
            1 -> {
                menu.showMenu(menu.menuItems.filterIsInstance<Burger>())
                while (true) {
                    val selectedBurger = menu.selectMenu(menu.menuItems.filterIsInstance<Burger>())
                    if (selectedBurger == 0) break
                    if (selectedBurger in 1..menu.menuItems.filterIsInstance<Burger>().size) {
                        val burger = menu.menuItems.filterIsInstance<Burger>()[selectedBurger - 1]
                        order.addItem(burger, paymentManager)
                    } else {
                        println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            2 -> {
                menu.showMenu(menu.menuItems.filterIsInstance<IceCream>())
                while (true) {
                    val selectedCustard = menu.selectMenu(menu.menuItems.filterIsInstance<IceCream>())
                    if (selectedCustard == 0) break
                    if (selectedCustard in 1..menu.menuItems.filterIsInstance<IceCream>().size) {
                        val custard = menu.menuItems.filterIsInstance<IceCream>()[selectedCustard - 1]
                        order.addItem(custard, paymentManager)
                    } else {
                        println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            3 -> {
                menu.showMenu(menu.menuItems.filterIsInstance<Drink>())
                while (true) {
                    val selectedDrink = menu.selectMenu(menu.menuItems.filterIsInstance<Drink>())
                    if (selectedDrink == 0) break
                    if (selectedDrink in 1..menu.menuItems.filterIsInstance<Drink>().size) {
                        val drink = menu.menuItems.filterIsInstance<Drink>()[selectedDrink - 1]
                        order.addItem(drink, paymentManager)
                    } else {
                        println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            4 -> {
                // 이전 코드와 동일 (Beer 메뉴 처리)
            }
            5 -> {
                order.checkOut(paymentManager) // 주문 확인 및 결제 처리
            }
            else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
        }
    }
}
