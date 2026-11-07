package p214w;

import A.W;
import D.J;
import H0.H;
import H0.K;
import H0.U;
import K9.AbstractC0405x;
import Z.C0672b;
import Z.C0681f0;
import androidx.compose.animation.c;
import p063g1.b;
import p063g1.l;
import p120l9.s;
import p223x.C1408a0;
import p223x.C1411c;
import p223x.w0;

/* JADX INFO: loaded from: classes.dex */
public final class O extends J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C1408a0 f23456G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f23457H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f23458I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f23459J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0681f0 f23460K;

    public O(C1408a0 c1408a0) {
        super(1);
        this.f23456G = c1408a0;
        this.f23457H = c.f11740a;
        this.f23458I = b.b(0, 0, 15);
        this.f23460K = C0672b.r(null);
    }

    @Override // D.J, J0.InterfaceC0302z
    public final H0.J e(K k7, H h7, long j) {
        U uA;
        char c10;
        M m10;
        long jD;
        M m11;
        if (k7.t()) {
            this.f23458I = j;
            this.f23459J = true;
            uA = h7.a(j);
        } else {
            uA = h7.a(this.f23459J ? this.f23458I : j);
        }
        U u8 = uA;
        long j10 = (((long) u8.f3169s) & 4294967295L) | (((long) u8.f3168r) << 32);
        if (k7.t()) {
            this.f23457H = j10;
            c10 = ' ';
            jD = j10;
            j10 = jD;
        } else {
            long j11 = !l.a(this.f23457H, c.f11740a) ? this.f23457H : j10;
            C0681f0 c0681f0 = this.f23460K;
            M m12 = (M) c0681f0.getValue();
            if (m12 != null) {
                C1411c c1411c = m12.f23449a;
                c10 = ' ';
                boolean z10 = (l.a(j11, ((l) c1411c.d()).f16260a) || ((Boolean) c1411c.f23944d.getValue()).booleanValue()) ? false : true;
                if (!l.a(j11, ((l) c1411c.f23945e.getValue()).f16260a) || z10) {
                    m12.f23450b = ((l) c1411c.d()).f16260a;
                    m11 = m12;
                    AbstractC0405x.x(h0(), null, new W(m11, j11, this, (p150o9.c) null), 3);
                } else {
                    m11 = m12;
                }
                m10 = m11;
            } else {
                c10 = ' ';
                long j12 = 1;
                m10 = new M(new C1411c(new l(j11), w0.f24119h, new l((j12 << 32) | (j12 & 4294967295L)), 8), j11);
            }
            c0681f0.setValue(m10);
            jD = b.d(j, ((l) m10.f23449a.d()).f16260a);
        }
        int i10 = (int) (jD >> c10);
        int i11 = (int) (jD & 4294967295L);
        return k7.g0(i10, i11, s.f19441r, new N(this, j10, i10, i11, k7, u8));
    }

    @Override // l0.q
    public final void l0() {
        this.f23457H = c.f11740a;
        this.f23459J = false;
    }

    @Override // l0.q
    public final void p0() {
        this.f23460K.setValue(null);
    }
}
