package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class ScaffoldModule : Module("scaffold", ModuleCategory.World) {
    private val mode by listValue("Mode", "Normal", listOf("Normal", "Expand", "Tower"))
    private val blocks by intValue("Blocks", 1, 1..6)
    private val towerMode by listValue("Tower Mode", "Jump", listOf("Jump", "Motion", "TP"))
    override fun onEnabled() { session.displayClientMessage("§a[Scaffold] $mode") }
}
