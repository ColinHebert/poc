package mockitobug.poc

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class BugJupitetTest {
    @Test
    fun test() {
        val test: Iterator<*>
        try {
            test = Mockito.mock(Iterator::class.java)
        } catch (e: Exception) {
            e.printStackTrace()
            return
        }

        println(test)
        assertEquals(2, (1 + 0).toLong())
    }
}
