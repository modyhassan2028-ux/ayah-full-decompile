package p227x3;

import N9.AbstractC0419l;
import N9.U;
import N9.k0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f24363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f24364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f24365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f24366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U f24367e;

    public a() {
        b bVar = b.f24368a;
        k0 k0VarC = AbstractC0419l.c(bVar);
        this.f24363a = k0VarC;
        this.f24364b = AbstractC0419l.c(bVar);
        k0 k0VarC2 = AbstractC0419l.c(new e(0L, "", false));
        this.f24365c = k0VarC2;
        this.f24366d = new U(k0VarC);
        this.f24367e = new U(k0VarC2);
    }

    public final void a(boolean z10) {
        if (((d) this.f24364b.getValue()) instanceof c) {
            e eVar = new e(System.currentTimeMillis(), "android.permission.POST_NOTIFICATIONS", z10);
            k0 k0Var = this.f24365c;
            k0Var.getClass();
            k0Var.n(null, eVar);
        }
    }

    public final void b(String str, String str2) {
        c cVar = new c(str, str2);
        k0 k0Var = this.f24363a;
        k0Var.getClass();
        k0Var.n(null, cVar);
    }
}
