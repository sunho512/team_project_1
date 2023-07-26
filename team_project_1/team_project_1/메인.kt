fun main() {
    val menu = Menu()

    while (true) {
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. 종료            | 프로그램 종료")

        val selectedMenu = menu.selectMenu(listOf("Burgers", "Forzen Custard"))

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
                            println("${menu.burgerMenu[selectedBurger - 1]}을(를) 선택하셨습니다.")
                            // 여기에서 선택한 버거 메뉴에 대한 처리를 추가.
                        }
                        else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            2 -> {
                menu.showMenu(menu.custardMenu)

                var selectedCustard: Int
                while (true) {
                    selectedCustard = menu.selectMenu(menu.custardMenu)
                    when (selectedCustard) {
                        0 -> break
                        in 1..menu.custardMenu.size -> {
                            println("${menu.custardMenu[selectedCustard - 1]}을(를) 선택하셨습니다.")
                        }
                        else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            3 -> {
                menu.showMenu(menu.drinksMenu)

                var selecteddrinks: Int
                while (true) {
                    selecteddrinks = menu.selectMenu(menu.drinksMenu)
                    when (selecteddrinks) {
                        0 -> break
                        in 1..menu.drinksMenu.size -> {
                            println("${menu.drinksMenu[selecteddrinks - 1]}을(를) 선택하셨습니다.")
                        }
                        else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
        }
    }
}
