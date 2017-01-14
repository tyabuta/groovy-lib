package net.tyfunction.category

@Category(String)
class StringToDateCategory {
    static String DATE_FORMAT_DATE = "yyyy-MM-dd"
    static String DATE_FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss"

    Date toDate(String fmt = DATE_FORMAT_DATE) {
        try {
            return Date.parse(fmt, this)
        }
        catch (Exception e) {
        }
        return null
    }

    Date toDateTime() {
        toDate(DATE_FORMAT_DATE_TIME)
    }

    boolean isEmptyDateTime() {
        this ==~ /0000-00-00 0{1,2}:00:00/
    }
}

