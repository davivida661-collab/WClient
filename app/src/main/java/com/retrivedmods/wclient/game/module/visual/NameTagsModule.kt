package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class NameTagsModule : Module("name_tags", ModuleCategory.Visual) {
    private val scale by floatValue("Scale", 1.5f, 0.5f..3.0f)
    private val showHealth by boolValue("Show Health", true)
    private val showDistance by boolValue("Show Distance", false)
    private val color by listValue("Color", "White", listOf("White", "Red", "Green", "Rainbow"))
    override fun onEnabled() { session.displayClientMessage("§a[NameTags] Enabled") }
}
