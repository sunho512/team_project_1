import java.math.BigDecimal

class PaymentManager {
    var balance: BigDecimal = BigDecimal("100000") // 잔액을 100원으로 초기화

    fun checkBalance(price: BigDecimal): Boolean {
        return balance >= price
    }

    fun deductAmount(price: BigDecimal) {
        balance -= price // 잔액을 감소시키는 부분 추가
    }
}


class Menu {
    val burgerMenu: List<String> = listOf(
        "ShackBurger   | $ 6900 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
        "SmokeShack    | $ 8900 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
        "Shroom Burger | $ 9400 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",
        "Cheeseburger  | $ 6900 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
        "Hamburger     | $ 5400 | 비프패티를 기반으로 야채가 들어간 기본버거"
    )

    val custardMenu: List<String> = listOf(
        "Shack             | $ 5900 | 바닐라, 초콜렛, 솔티드 캬라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피",
        "Shack of the week | $ 6500 | 특별한 커스타드 플레이버",
        "Red bean shack    | $ 6500 | 신성한 커스타드와 함께 우유와 레드빈이 블렌딩 된 시그널 쉐이크",
        "Floats            | $ 5900 | 루트 비어, 퍼플 카우, 크림시클"
    )

    val drinksMenu: List<String> = listOf(
        "Hallabong Lemonade  | W 5500 | 쉐이크쉑 시그니처 레몬에이드에 향긋한 한라봉 맛이 더해진 시즌 한정 레몬에이드",
        "Lemonade            | W 5000 | 매장에서 직접 만드는 상큼한 레몬에이드",
        "Fountain Soda       | W 3600 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플",
        "Abita Root Beer     | W 4800 | 청량감 있는 독특한 미국식 무알콜 탄산음료",
        "Hot Tea             | W 3400 | 보성 유기농 찻잎을 우려낸 녹차, 홍차, 페퍼민트 & 레몬그라스"
    )

    fun showMenu(menuList: List<String>): Unit {
        println("[ MENU ]")
        for ((index, menu) in menuList.withIndex()) {
            println("${index + 1}. $menu")
        }
        println("0. 뒤로가기")
    }

    fun selectMenu(menuList: List<String>): Int {
        print("메뉴를 선택해주세요: ")
        return readLine()?.toIntOrNull() ?: -1
    }
}
