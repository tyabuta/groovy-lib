package net.tyfunction.category

@Category(Date)
class DateToStringCategory {
    String toString(String fmt = StringToDateCategory.DATE_FORMAT_DATE_TIME) {
        format(fmt)
    }
}

