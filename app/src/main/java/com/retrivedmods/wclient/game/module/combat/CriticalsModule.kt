package com.retrivedmods.wclient.game.module.combat
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket

class CriticalsModule : Module("criticals", ModuleCategory.Combat) {
    private val mode by listValue("Mode", "Packet", listOf("Packet", "MiniJump", "Motion"))
    private val chance by intValue("Chance", 100, 1..100)
    
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
        val packet = interceptablePacket.packet
        if (packet !is PlayerAuthInputPacket) return
    }
}
