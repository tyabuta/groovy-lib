package net.tyfunction.category

import spock.lang.*
import spock.util.mop.Use


@Use(StringToDateCategory)
class StringToDateCategorySpec extends Specification {
    def "test to Date"() {
        expect:
        ret == (str.toDate() == Date.parse("yyyy-MM-dd", str))


        where:
        str          || ret
        "2016-01-01" || true
    }


    def "test to DateTime"() {
        expect:
        ret == (str.toDateTime() == Date.parse("yyyy-MM-dd HH:mm:ss", str))


        where:
        str          || ret
        "2016-01-01 23:00:00" || true
    }

}