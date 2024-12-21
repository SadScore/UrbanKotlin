package NullAndNullable

/**
 * Написать функцию, которая выводит в консоль Вашу любимую книгу. Входной параметр – название книги.
 * Если в аргументы передается значение null, вывести фразу «У меня нет любимой книги».
 */
fun main() {
    myFavoriteBook("Harry Potter")
    myFavoriteBook(null)

}
fun myFavoriteBook(bookName: String?) {
    val printBook = bookName ?: "У меня нет любимой книги"
    println(printBook)

}