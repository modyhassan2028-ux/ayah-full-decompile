package p020c;

import E1.a;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;

/* JADX INFO: renamed from: c.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0781f implements InterfaceC0769s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f13375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f13376s;

    public /* synthetic */ C0781f(D d5, ComponentActivity componentActivity) {
        this.f13375r = d5;
        this.f13376s = componentActivity;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        int i10 = ComponentActivity.f11367K;
        if (enumC0766o == EnumC0766o.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = a.a(this.f13376s);
            D d5 = this.f13375r;
            d5.f13358e = onBackInvokedDispatcherA;
            d5.d(d5.g);
        }
    }
}
