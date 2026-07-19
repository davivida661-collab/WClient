package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.MovePlayerPacket

class NoRotateModule : Module("no_rotate", ModuleCategory.Misc) {
    private val mode by listValue("Mode", "Server", listOf("Server", "Both", "All"))
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
        val packet = interceptablePacket.packet
        if (packet is MovePlayerPacket && packet.runtimeEntityId == session.localPlayer.runtimeEntityId) {
            interceptablePacket.intercept()
        }
    }
    override fun onEnabled() { session.displayClientMessage("§a[NoRotate] $mode") }
}
