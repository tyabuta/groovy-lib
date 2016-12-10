package net.tyfunction.category

@Category(String)
class StringToDateCategory {
    static String DATE_FORMAT_DATE = "yyyy-MM-dd"
    static String DATE_FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss"

    def toDate(String fmt = DATE_FORMAT_DATE) {
        try {
            return Date.parse(fmt, this)
        }
        catch (def e) {
        }
        return null
    }

    def toDateTime() {
        return this.toDate(DATE_FORMAT_DATE_TIME)
    }

    def isEmptyDateTime() {
        return (this ==~ /0000-00-00 0{1,2}:00:00/)
    }
}

