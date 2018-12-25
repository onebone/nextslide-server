package me.onebone.nextslide.editor

import me.onebone.nextslide.Server
import me.onebone.nextslide.editor.shape.Shape

class Document (
	val server: Server,
	var objs: Array<Shape>
){
	private var objectId = 0
	private var sessions: Array<Session> = arrayOf()

	init {
		if(this.objs.isNotEmpty()) {
			this.calculateObjectId()
		}
	}

	fun getObjectId(using: Boolean=true): Int {
		val ret = this.objectId
		if(using) {
			this.objectId++
		}

		return ret
	}

	private fun calculateObjectId() {
		var max = 0
		this.objs.forEach {
			if(max < it.id) max = it.id
		}
		this.objectId = max
	}

	fun addObject(obj: Shape) {
		this.objs += obj

		if(obj.id >= this.objectId) this.objectId = obj.id + 1
	}

	fun addSession(sess: Session) {
		this.sessions += sess
	}
}