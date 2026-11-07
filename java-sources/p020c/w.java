package p020c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import p110k9.a;
import p110k9.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC0769s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f13405s = a.d(t.f13400r);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ComponentActivity f13406r;

    public w(ComponentActivity componentActivity) {
        this.f13406r = componentActivity;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        if (enumC0766o != EnumC0766o.ON_DESTROY) {
            return;
        }
        Object systemService = this.f13406r.getSystemService("input_method");
        j.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        s sVar = (s) f13405s.getValue();
        Object objB = sVar.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = sVar.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = sVar.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
