package com.retrivedmods.wclient.game.module.misc
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AutoToolModule : Module("auto_tool", ModuleCategory.Misc) {
    private val mode by listValue("Mode", "Sword", listOf("Sword", "Pickaxe", "Axe", "Shovel", "All"))
    private val autoSwitchBack by boolValue("Auto Switch Back", true)
    override fun onEnabled() { session.displayClientMessage("§a[AutoTool] $mode") }
}
