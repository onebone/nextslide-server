package me.onebone.nextslide.editor.math

class Vector2(var x: Double, var y: Double) {
	fun add(x: Double, y: Double): Vector2 =
		Vector2(this.x + x, this.y + y)

	fun add(vec: Vector2): Vector2 =
		Vector2(this.x + vec.x, this.y + vec.y)

	fun subtract(x: Double, y: Double): Vector2 =
		Vector2(this.x - x, this.y - y)

	fun subtract(vec: Vector2): Vector2 =
		Vector2(this.x - vec.x, this.y - vec.y)

	fun divide(v: Double): Vector2 =
		Vector2(this.x / v, this.y / v)

	fun multiply(v: Double): Vector2 =
		Vector2(this.x * v, this.y * v)

	fun distance(vec: Vector2): Double {
		return Math.hypot(this.x - vec.x, this.y - vec.y)
	}

	fun asVector2(): Vector2 = Vector2(this.x, this.y)
}