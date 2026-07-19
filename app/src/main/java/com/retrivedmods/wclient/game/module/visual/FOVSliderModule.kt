package com.retrivedmods.wclient.game.module.visual
import com.retrivedmods.wclient.game.InterceptablePacket
import com.retrivedmods.wclient.game.Module
import com.retrivedmods.wclient.game.ModuleCategory

class FOVSliderModule : Module("fov_slider", ModuleCategory.Visual) {
    private val fov by intValue("FOV", 90, 30..180)
    private val dynamicFov by boolValue("Dynamic FOV", false)
    private val smooth by boolValue("Smooth", true)
    override fun onEnabled() { session.displayClientMessage("§a[FOV] ${fov}°") }
}
