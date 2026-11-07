package K0;

import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: K0.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0378x0 implements p150o9.g, Y0.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C0378x0 f5202r = new C0378x0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h1 f5203s = new h1();

    public static final boolean a() {
        Class cls = AndroidComposeView.f11987U0;
        try {
            if (AndroidComposeView.f11987U0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                AndroidComposeView.f11987U0 = cls2;
                AndroidComposeView.f11988V0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = AndroidComposeView.f11988V0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
