package app.list

class ToDoList {
    companion object Factory {
    fun createList(): ToDoList = ToDoList()
}
var UID: String? = null
var itemDataText: String?= null
var done: Boolean? = false
}
