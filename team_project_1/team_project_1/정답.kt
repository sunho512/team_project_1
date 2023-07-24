fun main() {
    val burgerMenu = BurgerMenu()
    val custardMenu = ForzenCustardMenu()
    var selectedMenu: Int

    while (true) {
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("0. 종료            | 프로그램 종료")

        print("메뉴를 선택해주세요: ")
        selectedMenu = readLine()?.toIntOrNull() ?: -1

        when (selectedMenu) {
            0 -> {
                println("프로그램을 종료합니다.")
                break
            }
            1 -> {
                burgerMenu.showMenu()

                var selectedBurger: Int
                while (true) {
                    print("메뉴를 선택해주세요: ")
                    selectedBurger = readLine()?.toIntOrNull() ?: -1

                    when (selectedBurger) {
                        0 -> break
                        in 1..4 -> {
                            println("${burgerMenu.menuMap[selectedBurger]}을(를) 선택하셨습니다.")
                            // 여기에서 선택한 버거 메뉴에 대한 처리를 추가할 수 있습니다.
                        }
                        else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            2 -> {
                custardMenu.showMenu()

                var selectedCustard: Int
                while (true) {
                    print("메뉴를 선택해주세요: ")
                    selectedCustard = readLine()?.toIntOrNull() ?: -1

                    when (selectedCustard) {
                        0 -> break
                        in 1..4 -> {
                            println("${custardMenu.custardMap[selectedCustard]}을(를) 선택하셨습니다.")
                            // 여기에서 선택한 커스타드 메뉴에 대한 처리를 추가할 수 있습니다.
                        }
                        else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
                    }
                }
            }
            3 -> {
                println("Drinks 메뉴를 선택했습니다.")
                // Drinks 메뉴에 대한 처리를 추가할 수 있습니다.
            }
            4 -> {
                println("Beer 메뉴를 선택했습니다.")
                // Beer 메뉴에 대한 처리를 추가할 수 있습니다.
            }
            else -> println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
        }
    }
}
