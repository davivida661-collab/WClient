package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class AmbienceModule : Module("ambience", ModuleCategory.Visual) {
    private val color by listValue("Color", "Red", listOf("Red", "Blue", "Green", "Purple", "Orange", "Pink"))
    private val intensity by floatValue("Intensity", 0.5f, 0.1f..1.0f)
    private val particles by boolValue("Particles", true)
    override fun onEnabled() { session.displayClientMessage("§a[Ambience] $color") }
}
