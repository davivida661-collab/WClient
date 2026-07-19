package com.retrivedmods.wclient.game.module.combat
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket

class BlockClutchModule : Module("block_clutch", ModuleCategory.Combat) {
    private val autoSwitch by boolValue("Auto Switch", true)
    private val onlyWhenFalling by boolValue("Only When Falling", true)
    
    override fun onEnabled() { session.displayClientMessage("§a[BlockClutch] Ready") }
}
