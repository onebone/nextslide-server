package me.onebone.nextslide.editor.shape

import me.onebone.nextslide.editor.Document
import me.onebone.nextslide.editor.math.Vector2
import me.onebone.nextslide.editor.math.Vector3
import java.io.Serializable

class Circle(
	doc: Document,
	id: Int,
	pos: Vector3,
	size: Vector2
): Shape(doc, id, pos, size) {
	override val type: String
		get() = "circle"

	override val meta = arrayOf(
		Pair<String, Serializable>("sx", this.size.x),
		Pair<String, Serializable>("sy", this.size.y)
	)

	override fun setMetadata(key: String, value: Any) {
		if(key == "sx") {
			if(value is Double) {
				this.size.x = value
			}
		}else if(key == "sy") {
			if(value is Double) {
				this.size.y = value
			}
		}
	}
}