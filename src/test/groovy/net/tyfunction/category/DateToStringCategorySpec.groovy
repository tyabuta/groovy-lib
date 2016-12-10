package net.tyfunction.category

import spock.lang.*
import spock.util.mop.Use


@Use(DateToStringCategory)
class DateToStringSpec extends Specification {
    def "test to String"() {
        expect:
        ret == (date.toString() == str)

        where:
        date                                   | str                   || ret
        Date.parse("yyyy-MM-dd", "2016-01-01") | "2016-01-01 00:00:00" || true
    }

}