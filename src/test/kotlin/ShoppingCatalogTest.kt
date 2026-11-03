
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.net.URL
import java.time.Duration

class ShoppingCatalogTest {

    private lateinit var driver: AndroidDriver

    @BeforeEach
    fun setUp() {
        val options = UiAutomator2Options()
            .setDeviceName("Android Emulator")
            .setUdid("emulator-5554")
            .setAppPackage("com.saucelabs.mydemoapp.android")
            .setAppActivity(
                "com.saucelabs.mydemoapp.android.view.activities.MainActivity"
            )
            .setNoReset(true)

        driver = AndroidDriver(
            URL("http://127.0.0.1:4723"),
            options
        )
    }

    @AfterEach
    fun tearDown() {
        if (::driver.isInitialized) {
            driver.quit()
        }
    }

    @Test
    fun productsShouldBeDisplayed() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(15))

        val product = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.androidUIAutomator(
                    "new UiSelector().text(\"Sauce Labs Backpack\")"
                )
            )
        )

        assertTrue(product.isDisplayed)
    }
}
