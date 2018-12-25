package me.onebone.nextslide

import io.vertx.core.AbstractVerticle
import io.vertx.ext.web.Router

class Server (private val port: Int): AbstractVerticle() {
	init {
		if(this.port < 0 || this.port > 65535) {
			throw IllegalArgumentException("Illegal port range given")
		}
	}

	override fun start() {
		vertx.createHttpServer()
			.requestHandler(this.createRouter())
			.listen(this.port)
	}

	private fun createRouter() = Router.router(this.vertx).apply {
		get("/").handler {
			it.response().sendFile("app/editor/index.html")
		}
		get("/dist/nextslide.bundle.js").handler {
			it.response().sendFile("app/editor/dist/nextslide.bundle.js")
		}
		get("/index.css").handler {
			it.response().sendFile("app/editor/index.css")
		}
	}
}