package me.onebone.nextslide

import io.vertx.core.Vertx

fun main(args: Array<String>) {
	val vertx = Vertx.vertx()
	vertx.deployVerticle(Server(8080))
}