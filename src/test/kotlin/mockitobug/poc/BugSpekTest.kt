package mockitobug.poc

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.mockito.Mockito

class BugSpekTest : Spek({
    describe("test") {
        it("works") {
            val test: Iterator<*>
            try {
                test = Mockito.mock(Iterator::class.java)
            } catch (e: Exception) {
                e.printStackTrace()
                throw Error()
            }

            println(test)
            assertThat(2, equalTo(1 + 0))
        }
    }
})

