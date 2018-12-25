package me.onebone.nextslide.editor

import me.onebone.nextslide.Server

class Session (
	val server: Server
){
	private val created: Long = System.currentTimeMillis()
}