package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class ChunkBordersModule : Module("chunk_borders", ModuleCategory.Visual) {
    private val color by listValue("Color", "White", listOf("White", "Red", "Green", "Blue", "Yellow"))
    private val lineWidth by floatValue("Line Width", 1.0f, 0.5f..3.0f)
    override fun onEnabled() { session.displayClientMessage("§a[ChunkBorders] On") }
    override fun onDisabled() { session.displayClientMessage("§c[ChunkBorders] Off") }
}
