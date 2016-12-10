package net.tyfunction.category

@Category(Date)
class DateToStringCategory {
    def toString(String fmt = StringToDateCategory.DATE_FORMAT_DATE_TIME){
        this.format(fmt)
    }
}

