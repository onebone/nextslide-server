package me.onebone.nextslide.editor.math

open class Vector3 (var x: Double, var y: Double, var z: Double) {
	fun add(x: Double, y: Double, z: Double): Vector3 =
			Vector3(this.x + x, this.y + y, this.z + z)

	fun add(vec: Vector3): Vector3 =
			Vector3(this.x + vec.x, this.y + vec.y, this.z + vec.z)

	fun subtract(x: Double, y: Double, z: Double): Vector3 =
			Vector3(this.x - x, this.y - y, this.z - z)

	fun subtract(vec: Vector3): Vector3 =
			Vector3(this.x - vec.x, this.y - vec.y, this.z - vec.z)

	fun divide(v: Double): Vector3 =
			Vector3(this.x / v, this.y / v, this.z / v)

	fun multiply(v: Double): Vector3 =
			Vector3(this.x * v, this.y * v, this.z * v)

	fun distance(vec: Vector3): Double {
		val dx = this.x - vec.x
		val dy = this.y - vec.y
		val dz = this.z - vec.z

		return Math.sqrt(dx*dx + dy*dy + dz*dz)
	}

	fun asVector3(): Vector3 = Vector3(this.x, this.y, this.z)
}