package p223x;

import Z.C0672b;
import Z.C0681f0;
import Z.L0;

/* JADX INFO: loaded from: classes.dex */
public final class D implements L0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Number f23824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Number f23825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v0 f23826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0681f0 f23827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i0 f23828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f23831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ F f23832z;

    public D(F f3, Number number, Number number2, v0 v0Var, C c10) {
        this.f23832z = f3;
        this.f23824r = number;
        this.f23825s = number2;
        this.f23826t = v0Var;
        this.f23827u = C0672b.r(number);
        this.f23828v = new i0(c10, v0Var, this.f23824r, this.f23825s, null);
    }

    @Override // Z.L0
    public final Object getValue() {
        return this.f23827u.getValue();
    }
}
