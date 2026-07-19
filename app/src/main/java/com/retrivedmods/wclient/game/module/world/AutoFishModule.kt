package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket

class AutoFishModule : Module("auto_fish", ModuleCategory.World) {
    private val autoCast by boolValue("Auto Cast", true)
    private val catchDelay by intValue("Catch Delay", 200, 50..1000)
    private var lastCatchTime = 0L
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
        val packet = interceptablePacket.packet
        if (packet !is PlayerAuthInputPacket) return
    }
}
