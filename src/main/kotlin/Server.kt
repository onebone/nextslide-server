package me.onebone.nextslide

import io.vertx.core.AbstractVerticle
import io.vertx.core.Handler
import io.vertx.core.http.ServerWebSocket
import io.vertx.ext.web.Router
import me.onebone.nextslide.editor.Document
import me.onebone.nextslide.editor.Session

class Server (private val port: Int): AbstractVerticle() {
	init {
		if(this.port < 0 || this.port > 65535) {
			throw IllegalArgumentException("Illegal port range given")
		}
	}

	fun getDocument(id: String): Document? {
		// TODO
		return Document(this, id, arrayOf())
	}

	override fun start() {
		vertx.createHttpServer()
			.requestHandler(this@Server.createRouter())
			.websocketHandler(this.createWebSocketHandler())
			.listen(this@Server.port)
	}

	private fun createWebSocketHandler(): Handler<ServerWebSocket> {
		return Handler { ws ->
			ws.textMessageHandler {
				println(it) // TODO!!
			}
		}
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