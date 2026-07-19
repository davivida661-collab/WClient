package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class FastBreakModule : Module("fast_break", ModuleCategory.World) {
    private val multiplier by floatValue("Multiplier", 2.0f, 1.0f..5.0f)
    private val mode by listValue("Mode", "Packet", listOf("Packet", "Instant", "Legit"))
    override fun onEnabled() { session.displayClientMessage("§a[FastBreak] x$multiplier") }
}
