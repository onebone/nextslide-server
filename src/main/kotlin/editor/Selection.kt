package me.onebone.nextslide.editor

data class Selection (
	var session: Session?,
	var time: Long?
) {
	val selected: Boolean
		get() = this.session != null && this.time != null
}