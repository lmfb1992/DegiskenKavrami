package DataClassGetterSetter

class Kitap(private var id: Int, var ad: String) {
    var ıd: Int
        get() = id
        set(id) {
            if (id < 0) {
                this.id = 1
            } else {
                this.id = id
            }
        }

}