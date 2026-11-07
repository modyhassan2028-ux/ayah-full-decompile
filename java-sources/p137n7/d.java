package p137n7;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f20022a;

    static {
        d dVar = new d(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
        f20022a = dVar;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
