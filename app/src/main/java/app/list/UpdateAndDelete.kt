package app.list

interface UpdateAndDelete {
    fun modifyItem(itemUID :String ,isDone :Boolean)
    fun onItemDelete(itemUID: String)

}