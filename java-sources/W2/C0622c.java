package W2;

import android.view.ViewGroup;

/* JADX INFO: renamed from: W2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0622c extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9528a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f9529b;

    public C0622c(ViewGroup viewGroup) {
        this.f9529b = viewGroup;
    }

    @Override // W2.q, W2.m
    public final void a(p pVar) {
        B0.c.h0(this.f9529b, false);
        this.f9528a = true;
    }

    @Override // W2.q, W2.m
    public final void b() {
        B0.c.h0(this.f9529b, false);
    }

    @Override // W2.q, W2.m
    public final void c() {
        B0.c.h0(this.f9529b, true);
    }

    @Override // W2.q, W2.m
    public final void e(p pVar) {
        if (!this.f9528a) {
            B0.c.h0(this.f9529b, false);
        }
        pVar.z(this);
    }
}
