import java.math.BigDecimal

class Menu {
    val menuItems: List<MenuItem> = listOf(
        Burger("ShackBurger", BigDecimal("6900"), "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
        Burger("SmokeShack", BigDecimal("8900"), "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
        Burger("Shroom Burger", BigDecimal("9400"), "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
        Burger("Cheeseburger", BigDecimal("6900"), "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
        Burger("Hamburger", BigDecimal("5400"), "비프패티를 기반으로 야채가 들어간 기본버거"),

        IceCream("Shack", BigDecimal("5900"), "바닐라, 초콜렛, 솔티드 캬라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피"),
        IceCream("Shack of the week", BigDecimal("6500"), "특별한 커스타드 플레이버"),
        IceCream("Red bean shack", BigDecimal("6500"), "신성한 커스타드와 함께 우유와 레드빈이 블렌딩 된 시그널 쉐이크"),
        IceCream("Floats", BigDecimal("5900"), "루트 비어, 퍼플 카우, 크림시클"),

        Drink("Hallabong Lemonade", BigDecimal("5500"), "쉐이크쉑 시그니처 레몬에이드에 향긋한 한라봉 맛이 더해진 시즌 한정 레몬에이드"),
        Drink("Lemonade", BigDecimal("5000"), "매장에서 직접 만드는 상큼한 레몬에이드"),
        Drink("Fountain Soda", BigDecimal("3600"), "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플"),
        Drink("Abita Root Beer", BigDecimal("4800"), "청량감 있는 독특한 미국식 무알콜 탄산음료"),
        Drink("Hot Tea", BigDecimal("3400"), "보성 유기농 찻잎을 우려낸 녹차, 홍차, 페퍼민트 & 레몬그라스")
    )

    fun showMenu(menuList: List<MenuItem>): Unit {
        println("[ MENU ]")
        for ((index, item) in menuList.withIndex()) {
            println("${index + 1}. ${item.name} | ${item.price}원 | ${item.explain}")
        }
        println("0. 뒤로가기")
    }

    fun selectMenu(menuList: List<MenuItem>): Int {
        print("메뉴를 선택해주세요: ")
        return readLine()?.toIntOrNull() ?: -1
    }
}
