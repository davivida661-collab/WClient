package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class NukerModule : Module("nuker", ModuleCategory.World) {
    private val radius by intValue("Radius", 3, 1..8)
    private val mode by listValue("Mode", "All", listOf("All", "Same", "Filter"))
    private val filter by listValue("Filter", "None", listOf("None", "Ores", "Stone", "Wood"))
    override fun onEnabled() { session.displayClientMessage("§a[Nuker] r$radius $mode") }
}
