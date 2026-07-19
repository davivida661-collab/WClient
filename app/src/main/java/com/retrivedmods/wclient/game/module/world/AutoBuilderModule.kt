package com.retrivedmods.wclient.game.module.world
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AutoBuilderModule : Module("auto_builder", ModuleCategory.World) {
    private val mode by listValue("Mode", "Floor", listOf("Floor", "Wall", "Roof", "Box"))
    private val size by intValue("Size", 5, 1..20)
    private val autoRotate by boolValue("Auto Rotate", true)
    override fun onEnabled() { session.displayClientMessage("§a[AutoBuilder] $mode ${size}x$size") }
}
