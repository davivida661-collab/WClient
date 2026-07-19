package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket
import org.cloudburstmc.math.vector.Vector2f

class DerpModule : Module("derp", ModuleCategory.Misc) {
    private val mode by listValue("Mode", "Spin", listOf("Spin", "Headless", "Jitter", "Crazy"))
    private val speed by intValue("Speed", 20, 1..100)
    private var tick = 0
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
        val packet = interceptablePacket.packet
        if (packet !is PlayerAuthInputPacket) return
        tick++
        packet.rotation = Vector2f.from((tick * speed) % 360f, 90f)
    }
    override fun onEnabled() { session.displayClientMessage("§a[Derp] $mode") }
}
