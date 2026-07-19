package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket

class TimerModule : Module("timer", ModuleCategory.Misc, defaultEnabled = false) {
    private val speed by floatValue("Speed", 2.0f, 0.1f..5.0f)
    private val mode by listValue("Mode", "Normal", listOf("Normal", "Smart", "Balanced"))
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
    }
    override fun onEnabled() { session.displayClientMessage("§a[Timer] x$speed") }
    override fun onDisabled() { session.displayClientMessage("§c[Timer] Reset") }
}
