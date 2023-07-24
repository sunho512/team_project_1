import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var menuRadioGroup: RadioGroup
    private lateinit var orderButton: Button
    private lateinit var orderResultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuRadioGroup = findViewById(R.id.menuRadioGroup)
        orderButton = findViewById(R.id.orderButton)
        orderResultText = findViewById(R.id.orderResultText)

        orderButton.setOnClickListener {
            val selectedMenuId = menuRadioGroup.checkedRadioButtonId
            val selectedMenu = findViewById<RadioButton>(selectedMenuId)?.text.toString()

            if (selectedMenu.isEmpty()) {
                orderResultText.text = "메뉴를 선택해주세요."
            } else {
                orderResultText.text = "$selectedMenu 주문이 접수되었습니다."
            }
        }
    }
}
