package app.template.patches.googlemessages

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.string

// Build: messages.android_20261020_00_RC01.phone_dynamic (obfuscated names, this build only).

/**
 * SMS pipeline entry (class dlgs, method b). Anchored on log strings.
 *
 * Filters are matched in order, so they must be listed in the order the const-string
 * instructions appear in the method: the empty-list check comes first in the bytecode,
 * then "Received", then "Queued". (Listing them in any other order never matches.)
 */
object SmsPipelineFingerprint : Fingerprint(
    returnType = "Ljava/lang/Object;",
    filters = listOf(
        string("Received empty list of messages. SubId: "),
        string("Received SMS for processing in pipeline."),
        string("Queued SMS for processing in pipeline.")
    )
)

/** RCS entry points on IncomingRcsMessageProcessor (dnbd). */
object RcsIncomingAFingerprint : Fingerprint(
    definingClass = "Ldnbd;",
    name = "a",
    returnType = "Lfuim;",
    parameters = listOf("Ldlyk;")
)

object RcsIncomingBFingerprint : Fingerprint(
    definingClass = "Ldnbd;",
    name = "b",
    returnType = "Lfuim;",
    parameters = listOf("Ldlyk;")
)
