package me.onebone.nextslide.editor.shape

import me.onebone.nextslide.editor.Document
import me.onebone.nextslide.editor.math.Vector2
import me.onebone.nextslide.editor.math.Vector3
import java.io.Serializable

class Circle(
	doc: Document,
	id: Int,
	pos: Vector3,
	var size: Vector2
): Shape(doc, id, pos) {
	override val type: String
		get() = "circle"

	override val meta = arrayOf(
		Pair<String, Serializable>("sx", this.size.x),
		Pair<String, Serializable>("sy", this.size.y)
	)
}