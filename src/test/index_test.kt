import kotlin.js.Promise
import kotlin.test.*

external fun setTimeout(handler: (Unit) -> Unit): dynamic

class IndexTest {
    @Test
    fun testVersion() {
        assertEquals(version(), "1.0.0")
    }

    @Test
    fun testAsync(): Promise<Boolean> {
        return Promise<Boolean> { resolve, _ ->
            setTimeout({
                assertEquals(true, true)
                resolve(true)
            })
        }
    }
}
