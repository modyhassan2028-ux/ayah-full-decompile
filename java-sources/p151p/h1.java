package p151p;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p140o.C1227a;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1227a f20671r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i1 f20672s;

    public h1(i1 i1Var) {
        this.f20672s = i1Var;
        Context context = i1Var.f20674a.getContext();
        CharSequence charSequence = i1Var.f20680h;
        C1227a c1227a = new C1227a();
        c1227a.f20080e = 4096;
        c1227a.g = 4096;
        c1227a.f20085l = null;
        c1227a.f20086m = null;
        c1227a.f20087n = false;
        c1227a.f20088o = false;
        c1227a.f20089p = 16;
        c1227a.f20083i = context;
        c1227a.f20076a = charSequence;
        this.f20671r = c1227a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i1 i1Var = this.f20672s;
        Window.Callback callback = i1Var.f20682k;
        if (callback == null || !i1Var.f20683l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f20671r);
    }
}
