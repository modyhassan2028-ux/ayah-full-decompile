package p249z7;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f24851a = new c(Integer.class, "circularRevealScrimColor");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((e) obj).getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((e) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
    }
}
