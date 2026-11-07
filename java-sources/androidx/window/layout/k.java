package androidx.window.layout;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        p251z9.j.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke != null) {
                    return ((Integer) objInvoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        p251z9.j.e(sidecarDeviceState, "sidecarDeviceState");
        int iA = a(sidecarDeviceState);
        if (iA < 0 || iA > 4) {
            return 0;
        }
        return iA;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        p120l9.r rVar = p120l9.r.f19440r;
        p251z9.j.e(sidecarWindowLayoutInfo, "info");
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? rVar : list;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke != null) {
                    return (List) objInvoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i10) {
        try {
            try {
                sidecarDeviceState.posture = i10;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
        }
    }
}
