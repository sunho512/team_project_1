import java.math.BigDecimal

fun main() {
    val menu = Menu()
    val paymentManager = PaymentManager()

    while (true) {
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. 종료            | 프로그램 종료")

        val selectedMenu = menu.selectMenu(listOf("Burgers", "Forzen Custard", "Drinks", "Beer"))

        when (selectedMenu) {
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
            1 -> {
                menu.showMenu(menu.burgerMenu)

                var selectedBurger: Int
                while (true) {
                    selectedBurger = menu.selectMenu(menu.burgerMenu)
                    when (selectedBurger) {
                        0 -> break
                        in 1..menu.burgerMenu.size -> {
                            val selectedBurgerInfo = menu.burgerMenu[selectedBurger - 1]
                            println("$selectedBurgerInfo 을(를) 선택하셨습니다.")
                            val priceString = selectedBurgerInfo.split("|")[1].trim().substringAfter("$").trim()
                            val price = BigDecimal(priceString)
                            if (paymentManager.checkBalance(price)) {
                                paymentManager.deductAmount(price) // 구매가 완료된 후에 잔액을 차감합니다.
                                println("구매가 완료되었습니다. 잔액: ${paymentManager.balance}원")
                            } else {
                                println("잔액이 부족합니다. 구매를 진행할 수 없습니다.")
                            }

                        }
                        else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            2 -> {
                menu.showMenu(menu.custardMenu)

                var selectedcustardu: Int
                while (true) {
                    selectedcustardu = menu.selectMenu(menu.custardMenu)
                    when (selectedcustardu) {
                        0 -> break
                        in 1..menu.custardMenu.size -> {
                            val selectedBurgerInfo = menu.custardMenu[selectedcustardu - 1]
                            println("$selectedBurgerInfo 을(를) 선택하셨습니다.")
                            val priceString = selectedBurgerInfo.split("|")[1].trim().substringAfter("$").trim()
                            val price = BigDecimal(priceString)
                            if (paymentManager.checkBalance(price)) {
                                paymentManager.deductAmount(price) // 구매가 완료된 후에 잔액을 차감합니다.
                                println("구매가 완료되었습니다. 잔액: ${paymentManager.balance}원")
                            } else {
                                println("잔액이 부족합니다. 구매를 진행할 수 없습니다.")
                            }

                        }
                        else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            3 -> {
                // 이전 코드와 동일 (Drinks 메뉴 처리)
            }
            4 -> {
                // 이전 코드와 동일 (Beer 메뉴 처리)
            }
            else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
        }
    }
}
