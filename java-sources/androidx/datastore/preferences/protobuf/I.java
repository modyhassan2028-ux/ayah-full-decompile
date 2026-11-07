package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class I {
    public static H a(Object obj, Object obj2) {
        H hB = (H) obj;
        H h7 = (H) obj2;
        if (!h7.isEmpty()) {
            if (!hB.f12384r) {
                hB = hB.b();
            }
            hB.a();
            if (!h7.isEmpty()) {
                hB.putAll(h7);
            }
        }
        return hB;
    }
}
