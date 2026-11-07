package p232y;

import A.C0040q0;
import A.U;
import A.k1;
import A.n1;
import B.j;
import B0.c;
import D0.z;
import F9.f;
import J0.InterfaceC0289l;
import K9.AbstractC0405x;
import K9.a0;
import R0.i;
import R0.u;
import W.C0557f1;
import android.view.KeyEvent;
import p110k9.y;
import p241y9.a;
import u.AbstractC1358m;
import u.w;

/* JADX INFO: renamed from: y.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1466u extends AbstractC1450d implements InterfaceC0289l {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f24586Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f24587Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final w f24588a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final w f24589b0;

    public C1466u(j jVar, O o10, a aVar, a aVar2) {
        super(jVar, o10, true, null, null, aVar);
        this.f24586Y = aVar2;
        this.f24587Z = true;
        int i10 = AbstractC1358m.f22738a;
        this.f24588a0 = new w(6);
        this.f24589b0 = new w(6);
    }

    @Override // p232y.AbstractC1450d
    public final void C0() {
        G0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // p232y.AbstractC1450d
    public final boolean D0(KeyEvent keyEvent) {
        boolean z10;
        long jH = c.H(keyEvent);
        if (this.f24586Y != null) {
            w wVar = this.f24588a0;
            if (wVar.d(jH) == null) {
                wVar.g(jH, AbstractC0405x.x(h0(), null, new C0040q0(this, (p150o9.c) null, 22), 3));
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // p232y.AbstractC1450d
    public final void E0(KeyEvent keyEvent) {
        long jH = c.H(keyEvent);
        w wVar = this.f24588a0;
        boolean z10 = false;
        if (wVar.d(jH) != null) {
            a0 a0Var = (a0) wVar.d(jH);
            if (a0Var != null) {
                if (a0Var.b()) {
                    a0Var.e(null);
                } else {
                    z10 = true;
                }
            }
            wVar.f(jH);
        }
        if (z10) {
            return;
        }
        this.f24489M.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[LOOP:2: B:24:0x007f->B:35:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[EDGE_INSN: B:44:0x00b2->B:36:0x00b2 BREAK  A[LOOP:2: B:24:0x007f->B:35:0x00af], SYNTHETIC] */
    public final void G0() {
        char c10;
        long j;
        long j10;
        long j11;
        w wVar = this.f24588a0;
        Object[] objArr = wVar.f22769c;
        long[] jArr = wVar.f22767a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j12 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            j10 = 128;
            while (true) {
                long j13 = jArr[i10];
                j11 = 255;
                if ((((~j13) << c11) & j13 & j12) != j12) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j13 & 255) < 128) {
                            ((a0) objArr[(i10 << 3) + i12]).e(null);
                        }
                        j13 >>= 8;
                        i12++;
                        c11 = c11;
                        j12 = j12;
                    }
                    c10 = c11;
                    j = j12;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    c10 = c11;
                    j = j12;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c11 = c10;
                j12 = j;
            }
        } else {
            c10 = 7;
            j = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        wVar.a();
        w wVar2 = this.f24589b0;
        Object[] objArr2 = wVar2.f22769c;
        long[] jArr2 = wVar2.f22767a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j14 = jArr2[i13];
                if ((((~j14) << c10) & j14 & j) == j) {
                    if (i13 != length2) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j14 & j11) < j10) {
                            ((AbstractC1464s) objArr2[(i13 << 3) + i15]).getClass();
                            throw null;
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length2) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        wVar2.a();
    }

    @Override // l0.q
    public final void p0() {
        G0();
    }

    @Override // p232y.AbstractC1450d
    public final void y0(R0.j jVar) {
        if (this.f24586Y != null) {
            C0557f1 c0557f1 = new C0557f1(21, this);
            f[] fVarArr = u.f7181a;
            jVar.e(i.f7086c, new R0.a(null, c0557f1));
        }
    }

    @Override // p232y.AbstractC1450d
    public final Object z0(z zVar, p150o9.c cVar) {
        p150o9.c cVar2 = null;
        C1465t c1465t = (!this.f24488L || this.f24586Y == null) ? null : new C1465t(this, 0);
        int i10 = 1;
        C1461o c1461o = new C1461o(this, cVar2, i10);
        C1465t c1465t2 = new C1465t(this, i10);
        U u8 = n1.f346a;
        Object objJ = AbstractC0405x.j(new k1(zVar, c1461o, c1465t, null, c1465t2, null), cVar);
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (objJ != aVar) {
            objJ = yVar;
        }
        return objJ == aVar ? objJ : yVar;
    }
}
