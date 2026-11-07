package p224x0;

import android.graphics.Path;
import java.util.List;
import p110k9.a;
import p110k9.h;
import p120l9.r;
import p123m2.c;
import p180s0.AbstractC1302k;
import p180s0.C1300i;
import p180s0.C1301j;
import p180s0.F;
import p196u0.d;
import p196u0.g;
import p251z9.j;

/* JADX INFO: renamed from: x0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1444h extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f24227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24228c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f24229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24231f;
    public F g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24233i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f24234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f24235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f24236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f24240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1300i f24241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1300i f24242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f24243t;

    public C1444h() {
        int i10 = G.f24154a;
        this.f24229d = r.f19440r;
        this.f24230e = 1.0f;
        this.f24232h = 0;
        this.f24233i = 0;
        this.j = 4.0f;
        this.f24235l = 1.0f;
        this.f24237n = true;
        this.f24238o = true;
        C1300i c1300iA = AbstractC1302k.a();
        this.f24241r = c1300iA;
        this.f24242s = c1300iA;
        this.f24243t = a.c(h.f19075s, C1443g.f24224s);
    }

    @Override // p224x0.C
    public final void a(d dVar) {
        d dVar2;
        g gVar;
        if (this.f24237n) {
            AbstractC1438b.d(this.f24229d, this.f24241r);
            e();
        } else if (this.f24239p) {
            e();
        }
        this.f24237n = false;
        this.f24239p = false;
        F f3 = this.f24227b;
        if (f3 != null) {
            dVar2 = dVar;
            c.i(dVar2, this.f24242s, f3, this.f24228c, null, 56);
        } else {
            dVar2 = dVar;
        }
        F f7 = this.g;
        if (f7 != null) {
            g gVar2 = this.f24240q;
            if (this.f24238o || gVar2 == null) {
                g gVar3 = new g(this.f24231f, this.j, this.f24232h, this.f24233i, 16);
                this.f24240q = gVar3;
                this.f24238o = false;
                gVar = gVar3;
            } else {
                gVar = gVar2;
            }
            c.i(dVar2, this.f24242s, f7, this.f24230e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, k9.g] */
    public final void e() {
        float f3 = this.f24234k;
        C1300i c1300i = this.f24241r;
        if (f3 == 0.0f && this.f24235l == 1.0f) {
            this.f24242s = c1300i;
            return;
        }
        if (j.a(this.f24242s, c1300i)) {
            this.f24242s = AbstractC1302k.a();
        } else {
            Path.FillType fillType = this.f24242s.f21829a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z10 = fillType == fillType2;
            this.f24242s.f21829a.rewind();
            Path path = this.f24242s.f21829a;
            if (!z10) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r10 = this.f24243t;
        ((C1301j) r10.getValue()).f21833a.setPath(c1300i != null ? c1300i.f21829a : null, false);
        float length = ((C1301j) r10.getValue()).f21833a.getLength();
        float f7 = this.f24234k;
        float f10 = this.f24236m;
        float f11 = ((f7 + f10) % 1.0f) * length;
        float f12 = ((this.f24235l + f10) % 1.0f) * length;
        if (f11 <= f12) {
            ((C1301j) r10.getValue()).a(f11, f12, this.f24242s);
        } else {
            ((C1301j) r10.getValue()).a(f11, length, this.f24242s);
            ((C1301j) r10.getValue()).a(0.0f, f12, this.f24242s);
        }
    }

    public final String toString() {
        return this.f24241r.toString();
    }
}
