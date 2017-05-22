package spring.play.app

import org.springframework.context.support.ClassPathXmlApplicationContext
import spring.play.lib.LibraryBean
import kotlin.test.assertEquals
import org.junit.Test as test

class TestApps {
    @org.junit.Test fun app1() {
        val context = ClassPathXmlApplicationContext("app1.xml")
        val bean = context.getBean(LibraryBean::class.java)
        assertEquals("APP1", bean.aMethod("app1"))
    }
}