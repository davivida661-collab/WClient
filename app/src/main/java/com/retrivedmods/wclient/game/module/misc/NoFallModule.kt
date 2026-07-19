package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket
import org.cloudburstmc.protocol.bedrock.data.PlayerAuthInputData

class NoFallModule : Module("no_fall", ModuleCategory.Misc) {
    private val mode by listValue("Mode", "Packet", listOf("Packet", "Motion", "Ground", "Edit"))
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
        val packet = interceptablePacket.packet
        if (packet !is PlayerAuthInputPacket) return
        if (mode == "Ground" || mode == "Edit")
            interceptablePacket.intercept()
    }
    override fun onEnabled() { session.displayClientMessage("§a[NoFall] $mode") }
}
