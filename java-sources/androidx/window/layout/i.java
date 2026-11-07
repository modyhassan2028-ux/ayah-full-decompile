package androidx.window.layout;

import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f13087r = new i(0);

    public static WindowLayoutComponent b() {
        ClassLoader classLoader = j.class.getClassLoader();
        if (classLoader != null) {
            p110k9.o oVar = j.f13088a;
            if (Build.VERSION.SDK_INT >= 24 && j.b(new h(classLoader, 3)) && j.b(new h(classLoader, 1)) && j.b(new h(classLoader, 2)) && j.b(new h(classLoader, 0))) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    @Override // p241y9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return b();
    }
}
