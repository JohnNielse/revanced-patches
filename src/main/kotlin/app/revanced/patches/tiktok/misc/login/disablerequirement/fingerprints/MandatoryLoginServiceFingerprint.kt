package app.revanced.patches.tiktok.misc.login.disablerequirement.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
object MandatoryLoginServiceFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ ->
        methodDef.definingClass.endsWith("/MandatoryLoginService;") &&
                methodDef.name == "enableForcedLogin"
    }
)