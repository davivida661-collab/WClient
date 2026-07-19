package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AutoFarmModule : Module("auto_farm", ModuleCategory.World) {
    private val radius by intValue("Radius", 5, 1..15)
    private val autoReplant by boolValue("Auto Replant", true)
    private val mode by listValue("Mode", "Crops", listOf("Crops", "All", "Custom"))
    override fun onEnabled() { session.displayClientMessage("§a[AutoFarm] $mode") }
}
