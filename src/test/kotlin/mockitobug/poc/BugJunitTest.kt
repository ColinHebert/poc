package mockitobug.poc

import org.junit.Test
import org.mockito.Mockito

import org.junit.Assert.assertEquals

class BugJunitTest {
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
