package com.cartel.garage

import platform.UIKit.UIDevice
import platform.UIKit.UIViewController

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}
fun MainViewController(): UIViewController =ComposeUIViewController{App()}
actual fun getPlatform(): Platform = IOSPlatform()