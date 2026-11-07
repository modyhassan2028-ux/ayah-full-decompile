package p173r2;

import java.util.LinkedHashMap;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f21433b = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21434a = new LinkedHashMap();

    public final void a(G g) {
        j.e(g, "navigator");
        String strD = i.d(g.getClass());
        if (strD.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f21434a;
        G g10 = (G) linkedHashMap.get(strD);
        if (j.a(g10, g)) {
            return;
        }
        if (g10 != null && g10.f21432b) {
            throw new IllegalStateException(("Navigator " + g + " is replacing an already attached " + g10).toString());
        }
        if (!g.f21432b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + g + " is already attached to another NavController").toString());
    }

    public final G b(String str) {
        j.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        G g = (G) this.f21434a.get(str);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException(a.D("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
