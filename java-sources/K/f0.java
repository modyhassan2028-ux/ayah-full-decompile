package K;

import U0.C0515g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f4632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U0.L f4633b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4636e;
    public final p063g1.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y0.d f4638h;
    public E6.u j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p063g1.m f4640k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4634c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4635d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4637f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4639i = p120l9.r.f19440r;

    public f0(C0515g c0515g, U0.L l10, boolean z10, p063g1.c cVar, Y0.d dVar, int i10) {
        this.f4632a = c0515g;
        this.f4633b = l10;
        this.f4636e = z10;
        this.g = cVar;
        this.f4638h = dVar;
    }

    public final void a(p063g1.m mVar) {
        E6.u uVar = this.j;
        if (uVar == null || mVar != this.f4640k || uVar.c()) {
            this.f4640k = mVar;
            uVar = new E6.u(this.f4632a, B0.c.a0(this.f4633b, mVar), this.f4639i, this.g, this.f4638h);
        }
        this.j = uVar;
    }
}
