package app.revanced.patches.twitter.misc.hook.json.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object LoganSquareFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ -> methodDef.definingClass.endsWith("LoganSquare;") }
)