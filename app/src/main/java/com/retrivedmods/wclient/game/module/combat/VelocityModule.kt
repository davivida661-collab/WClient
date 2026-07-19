package com.retrivedmods.wclient.game.module.combat
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.SetEntityMotionPacket

class VelocityModule : Module("velocity", ModuleCategory.Combat) {
    private val horizontal by floatValue("Horizontal", 0.0f, 0.0f..1.0f)
    private val vertical by floatValue("Vertical", 0.0f, 0.0f..1.0f)
    
    override fun beforePacketBound(interceptablePacket: InterceptablePacket) {
        if (!isEnabled) return
        val packet = interceptablePacket.packet
        if (packet is SetEntityMotionPacket && packet.runtimeEntityId == session.localPlayer.runtimeEntityId) {
            if (horizontal <= 0f && vertical <= 0f) interceptablePacket.intercept()
            else {
                packet.motion = packet.motion.mul(horizontal, vertical, horizontal)
            }
        }
    }
}
