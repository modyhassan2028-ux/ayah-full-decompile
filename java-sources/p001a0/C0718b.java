package p001a0;

import J0.C0299w;
import Z.AbstractC0700p;
import Z.C0698o;
import java.util.ArrayList;
import p050e8.b;

/* JADX INFO: renamed from: a0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0718b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0698o f11087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0717a f11088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11089c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11092f;
    public int g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11096l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0299w f11090d = new C0299w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11091e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f11093h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11094i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11095k = -1;

    public C0718b(C0698o c0698o, C0717a c0717a) {
        this.f11087a = c0698o;
        this.f11088b = c0717a;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f11093h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i10 = this.g;
        if (i10 > 0) {
            J j = this.f11088b.f11086i;
            j.W(G.f11077c);
            j.f11082k[j.f11083l - j.f11081i[j.j - 1].f11079a] = i10;
            this.g = 0;
        }
        ArrayList arrayList = this.f11093h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0717a c0717a = this.f11088b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        c0717a.getClass();
        if (size != 0) {
            J j10 = c0717a.f11086i;
            j10.W(k.f11105c);
            b.Y(j10, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i10 = this.f11096l;
        if (i10 > 0) {
            int i11 = this.f11094i;
            if (i11 >= 0) {
                b();
                J j = this.f11088b.f11086i;
                j.W(y.f11122c);
                int i12 = j.f11083l - j.f11081i[j.j - 1].f11079a;
                int[] iArr = j.f11082k;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f11094i = -1;
            } else {
                int i13 = this.f11095k;
                int i14 = this.j;
                b();
                J j10 = this.f11088b.f11086i;
                j10.W(v.f11119c);
                int i15 = j10.f11083l - j10.f11081i[j10.j - 1].f11079a;
                int[] iArr2 = j10.f11082k;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.j = -1;
                this.f11095k = -1;
            }
            this.f11096l = 0;
        }
    }

    public final void d(boolean z10) {
        C0698o c0698o = this.f11087a;
        int i10 = z10 ? c0698o.f10711F.f10846i : c0698o.f10711F.g;
        int i11 = i10 - this.f11092f;
        if (i11 < 0) {
            AbstractC0700p.c("Tried to seek backward");
        }
        if (i11 > 0) {
            J j = this.f11088b.f11086i;
            j.W(C0720d.f11098c);
            j.f11082k[j.f11083l - j.f11081i[j.j - 1].f11079a] = i11;
            this.f11092f = i10;
        }
    }

    public final void e(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                AbstractC0700p.c("Invalid remove index " + i10);
            }
            if (this.f11094i == i10) {
                this.f11096l += i11;
                return;
            }
            c();
            this.f11094i = i10;
            this.f11096l = i11;
        }
    }
}
