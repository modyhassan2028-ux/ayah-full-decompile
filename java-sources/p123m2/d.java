package p123m2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19523a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19524b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f19525c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19526d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                c.C(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
