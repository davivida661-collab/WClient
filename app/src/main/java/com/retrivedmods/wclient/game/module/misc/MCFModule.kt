package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class MCFModule : Module("mcf", ModuleCategory.Misc) {
    private val mode by listValue("Mode", "Friends", listOf("Friends", "Enemies", "All"))
    private val byKey by boolValue("Trigger by Key", true)
    override fun onEnabled() { session.displayClientMessage("§a[MCF] $mode") }
}
