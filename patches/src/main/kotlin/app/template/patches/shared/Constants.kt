package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_GOOGLE_MESSAGES = Compatibility(
        name = "Google Messages",
        packageName = "com.google.android.apps.messaging",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x1A73E8,
        targets = listOf(
            AppTarget(version = "messages.android_20261020_00_RC01.phone_dynamic"),
            // Samsung flavor from Play (what a Galaxy phone installs). Same obfuscated
            // classes and methods as RC01 for everything this patch touches.
            AppTarget(version = "messages.android_20261020_00_RC00.phone_samsung_dynamic")
        )
    )
}
