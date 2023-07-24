class BurgerMenu {
    val menuMap: Map<Int, String> = mapOf(
        1 to "ShackBurger",
        2 to "SmokeShack",
        3 to "Shroom Burger",
        4 to "Cheeseburger",
        5 to "Hamburger"
    )

    fun showMenu(): Unit {
        println("[ Burgers MENU ]")
        println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기       | 뒤로가기")
    }
}

class ForzenCustardMenu {
    val custardMap: Map<Int, String> = mapOf(
        1 to "Shack",
        2 to "Shack of the week",
        3 to "Red bean shack",
        4 to "Froot"
    )

    fun showMenu(): Unit {
        println("[ Forzen Custard MENU ]")
        println("1. Shack             | W 5.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. Shack of the week | W 6.5 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. Red been shack    | W 6.5 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("3. Floot             | W 5.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("0. 뒤로가기           | 뒤로가기")
    }
}
