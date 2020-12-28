package org.kamiblue.botkt

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import kotlin.system.exitProcess

object Main {

    val logger: Logger = LogManager.getLogger("Bot-kt-server")

    @JvmStatic
    fun main(vararg args: String) {
        logger.error("mfw")
        exit()
    }

    fun exit() {
        exitProcess(0)
    }
}
