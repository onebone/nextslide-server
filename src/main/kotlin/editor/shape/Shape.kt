package me.onebone.nextslide.editor.shape

import me.onebone.nextslide.editor.Document
import me.onebone.nextslide.editor.Selection
import me.onebone.nextslide.editor.math.Vector2
import me.onebone.nextslide.editor.math.Vector3
import java.io.Serializable

abstract class Shape(
	private val doc: Document,
	val id: Int,
	var pos: Vector3,
	var size: Vector2
): Vector3(pos.x, pos.y, pos.z) { // z for z-index
	private val selection: Selection = Selection(null, null)

	abstract val type: String
	abstract val meta: Array<Pair<String, Serializable>>
	abstract fun setMetadata(key: String, value: Any)
}