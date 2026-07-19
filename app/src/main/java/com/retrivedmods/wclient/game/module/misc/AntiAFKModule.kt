package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket

class AntiAFKModule : Module("anti_afk", ModuleCategory.Misc) {
    private val mode by listValue("Mode", "Rotate", listOf("Rotate", "Jump", "Walk", "Random"))
    private val interval by intValue("Interval", 30, 5..300)
    private var lastAction = 0L
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastAction > interval * 1000L) {
            lastAction = currentTime
            session.displayClientMessage("§7[AntiAFK] Moving...")
        }
    }
    override fun onEnabled() { session.displayClientMessage("§a[AntiAFK] $mode") }
}
