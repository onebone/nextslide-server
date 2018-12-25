package me.onebone.nextslide.editor

import io.vertx.core.http.ServerWebSocket
import me.onebone.nextslide.Server

class Session (
	val server: Server,
	val socket: ServerWebSocket,
	doc: Document?
){
	var doc: Document? = doc

	private val created: Long = System.currentTimeMillis()
}