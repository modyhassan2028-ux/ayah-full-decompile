package p249z7;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24850a = new b(d.class, "circularReveal");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((e) obj).getRevealInfo();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((e) obj).setRevealInfo((d) obj2);
    }
}
