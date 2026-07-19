package com.retrivedmods.wclient.game.module.motion
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class GlideModule : Module("glide", ModuleCategory.Motion) {
    private val glideSpeed by floatValue("Glide Speed", 0.1f, 0.01f..0.5f)
    private val fallSpeed by floatValue("Fall Speed", 0.5f, 0.1f..2.0f)
    
    override fun onEnabled() { session.displayClientMessage("§a[Glide] Enabled") }
}
