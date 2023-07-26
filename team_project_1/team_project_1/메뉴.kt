
class Menu {
    val burgerMenu: List<String> = listOf(
        "ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
        "SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
        "Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",
        "Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
        "Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
    )

    val custardMenu: List<String> = listOf(
        "Shack             | W 5.9 | 11111",
        "Shack of the week | W 6.5 | 22222",
        "Red bean shack    | W 6.5 | 33333",
        "Floats            | W 5.9 | 44444"
    )

    val drinksMenu: List<String> = listOf(
        "Hallabong Lemonade  | W 5.5 | 쉐이크쉑 시그니처 레몬에이드에 향긋한 한라봉 맛이 더해진 시즌 한정 레몬에이드",
        "Lemonade            | W 5.0 | 매장에서 직접 만드는 상큼한 레몬에이드",
        "Fountain Soda       | W 3.6 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플",
        "Abita Root Beer     | W 4.8 | 청량감 있는 독특한 미국식 무알콜 탄산음료",
        "Hot Tea             | W 3.4 | 보성 유기농 찻잎을 우려낸 녹차, 홍차, 페퍼민트 & 레몬그라스"
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