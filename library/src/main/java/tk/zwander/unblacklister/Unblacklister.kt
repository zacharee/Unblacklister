package tk.zwander.unblacklister

import android.os.Build
import java.lang.reflect.Method

fun disableApiBlacklist() {
    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O_MR1) {
        val forName = Class::class.java.getDeclaredMethod("forName", String::class.java)
        val getDeclaredMethod = Class::class.java.getDeclaredMethod(
            "getDeclaredMethod",
            String::class.java,
            arrayOf<Class<*>>()::class.java
        )

        val vmRuntimeClass = forName.invoke(null, "dalvik.system.VMRuntime") as Class<*>
        val getRuntime = getDeclaredMethod.invoke(vmRuntimeClass, "getRuntime", null) as Method
        val setHiddenApiExemptions = getDeclaredMethod.invoke(
            vmRuntimeClass,
            "setHiddenApiExemptions",
            arrayOf(arrayOf<String>()::class.java)
        ) as Method

        val vmRuntime = getRuntime.invoke(null)

        setHiddenApiExemptions.invoke(vmRuntime, arrayOf("L"))
    }
}