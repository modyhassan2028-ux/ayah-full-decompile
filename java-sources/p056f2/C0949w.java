package p056f2;

import L5.c;
import M2.e;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.w;
import p020c.D;
import p020c.F;

/* JADX INFO: renamed from: f2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0949w extends AbstractC0951y implements V, F, e, O {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FragmentActivity f16172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FragmentActivity f16173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handler f16174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final L f16175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f16176v;

    public C0949w(FragmentActivity fragmentActivity) {
        this.f16176v = fragmentActivity;
        Handler handler = new Handler();
        this.f16172r = fragmentActivity;
        this.f16173s = fragmentActivity;
        this.f16174t = handler;
        this.f16175u = new L();
    }

    @Override // p020c.F
    public final D a() {
        return this.f16176v.a();
    }

    @Override // M2.e
    public final c b() {
        return (c) this.f16176v.f11380u.f5533t;
    }

    @Override // p056f2.AbstractC0951y
    public final View d(int i10) {
        return this.f16176v.findViewById(i10);
    }

    @Override // p056f2.AbstractC0951y
    public final boolean e() {
        Window window = this.f16176v.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.V
    public final U g() {
        return this.f16176v.g();
    }

    @Override // androidx.lifecycle.InterfaceC0771u
    public final w h() {
        return this.f16176v.f12592M;
    }

    @Override // p056f2.O
    public final void c() {
    }
}
