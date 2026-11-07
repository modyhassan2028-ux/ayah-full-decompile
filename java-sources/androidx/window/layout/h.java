package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f13086s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ClassLoader classLoader, int i10) {
        super(0);
        this.f13085r = i10;
        this.f13086s = classLoader;
    }

    @Override // p241y9.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        int i10 = this.f13085r;
        ClassLoader classLoader = this.f13086s;
        boolean z10 = false;
        switch (i10) {
            case 0:
                p110k9.o oVar = j.f13088a;
                Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
                Method method = clsLoadClass.getMethod("getBounds", null);
                Method method2 = clsLoadClass.getMethod("getType", null);
                Method method3 = clsLoadClass.getMethod("getState", null);
                p251z9.j.d(method, "getBoundsMethod");
                if (method.getReturnType().equals(p171r0.a.d(p251z9.w.a(Rect.class))) && Modifier.isPublic(method.getModifiers())) {
                    p251z9.j.d(method2, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (method2.getReturnType().equals(p171r0.a.d(p251z9.w.a(cls))) && Modifier.isPublic(method2.getModifiers())) {
                        p251z9.j.d(method3, "getStateMethod");
                        if (method3.getReturnType().equals(p171r0.a.d(p251z9.w.a(cls))) && Modifier.isPublic(method3.getModifiers())) {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 1:
                p110k9.o oVar2 = j.f13088a;
                Method method4 = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                p251z9.j.d(method4, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    p251z9.j.d(clsLoadClass2, "windowLayoutComponentClass");
                    if (method4.getReturnType().equals(clsLoadClass2)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 2:
                p110k9.o oVar3 = j.f13088a;
                Class<?> clsLoadClass3 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Method method5 = clsLoadClass3.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method method6 = clsLoadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                p251z9.j.d(method5, "addListenerMethod");
                if (Modifier.isPublic(method5.getModifiers())) {
                    p251z9.j.d(method6, "removeListenerMethod");
                    if (Modifier.isPublic(method6.getModifiers())) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            default:
                p110k9.o oVar4 = j.f13088a;
                Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass4 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                p251z9.j.d(declaredMethod, "getWindowExtensionsMethod");
                p251z9.j.d(clsLoadClass4, "windowExtensionsClass");
                if (declaredMethod.getReturnType().equals(clsLoadClass4) && Modifier.isPublic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
