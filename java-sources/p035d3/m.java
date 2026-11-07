package p035d3;

import J3.x;
import p018b9.g;
import p061f9.b;
import p144o3.a;
import p144o3.h;
import p174r3.c;
import p174r3.l;
import p198u3.d;
import p198u3.e;
import p218w3.j;
import p218w3.n;
import z3.f;

/* JADX INFO: loaded from: classes.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f15623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15625c;

    public m(u uVar, n nVar, int i10) {
        this.f15623a = uVar;
        this.f15624b = nVar;
        this.f15625c = i10;
    }

    @Override // p101j9.a
    public final Object get() {
        int i10 = this.f15625c;
        if (i10 == 0) {
            return new g();
        }
        u uVar = this.f15623a;
        if (i10 == 1) {
            return new n(uVar.f15659a.f1940a, (c) uVar.f15667k.get(), (D3.c) uVar.f15665h.get(), (x) uVar.f15666i.get(), (l) uVar.f15674r.get());
        }
        if (i10 == 2) {
            return new P5.g((j) uVar.f15681y.get(), (h) uVar.f15675s.get(), (a) uVar.f15647F.get(), (p155p3.a) uVar.f15651J.get(), new p085i0.n(this.f15624b.f15626a.c()));
        }
        if (i10 == 3) {
            return new f((d) uVar.f15678v.get(), (e) uVar.f15654M.get(), (p198u3.f) uVar.f15652K.get(), (a) uVar.f15647F.get());
        }
        throw new AssertionError(i10);
    }
}
