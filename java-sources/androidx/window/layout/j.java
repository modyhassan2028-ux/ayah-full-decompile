package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p110k9.o f13088a = p110k9.a.d(i.f13087r);

    public static WindowLayoutComponent a() {
        return (WindowLayoutComponent) f13088a.getValue();
    }

    public static boolean b(p241y9.a aVar) {
        try {
            return ((Boolean) aVar.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
