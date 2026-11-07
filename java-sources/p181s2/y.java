package p181s2;

import K9.InterfaceC0402u;
import Z.C0681f0;
import Z.L0;
import java.util.Iterator;
import java.util.List;
import p110k9.a;
import p150o9.c;
import p173r2.A;
import p173r2.j;
import p223x.q0;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class y extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q0 f22117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f22118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f22119t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u.y f22120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ L0 f22121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f22122w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q0 q0Var, A a9, j jVar, u.y yVar, L0 l10, i iVar, c cVar) {
        super(2, cVar);
        this.f22117r = q0Var;
        this.f22118s = a9;
        this.f22119t = jVar;
        this.f22120u = yVar;
        this.f22121v = l10;
        this.f22122w = iVar;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        return new y(this.f22117r, this.f22118s, this.f22119t, this.f22120u, this.f22121v, this.f22122w, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) create((InterfaceC0402u) obj, (c) obj2);
        p110k9.y yVar2 = p110k9.y.f19095a;
        yVar.invokeSuspend(yVar2);
        return yVar2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00df A[LOOP:1: B:15:0x005f->B:28:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[EDGE_INSN: B:33:0x00e3->B:29:0x00e3 BREAK  A[LOOP:1: B:15:0x005f->B:28:0x00df], SYNTHETIC] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        char c10;
        a.e(obj);
        q0 q0Var = this.f22117r;
        Object objI = q0Var.f24065a.i();
        C0681f0 c0681f0 = q0Var.f24068d;
        if (p251z9.j.a(objI, c0681f0.getValue()) && (((j) this.f22118s.f21412b.f22854f.h()) == null || p251z9.j.a(c0681f0.getValue(), this.f22119t))) {
            Iterator it = ((List) this.f22121v.getValue()).iterator();
            while (it.hasNext()) {
                this.f22122w.b().c((j) it.next());
            }
            u.y yVar = this.f22120u;
            long[] jArr = yVar.f22778a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    char c11 = 7;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj2 = yVar.f22779b[i13];
                                c10 = c11;
                                float f3 = yVar.f22780c[i13];
                                if (!p251z9.j.a((String) obj2, ((j) c0681f0.getValue()).f21446w)) {
                                    yVar.f22782e--;
                                    long[] jArr2 = yVar.f22778a;
                                    int i14 = yVar.f22781d;
                                    int i15 = i13 >> 3;
                                    int i16 = (i13 & 7) << 3;
                                    long j10 = (jArr2[i15] & (~(255 << i16))) | (254 << i16);
                                    jArr2[i15] = j10;
                                    jArr2[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j10;
                                    yVar.f22779b[i13] = null;
                                }
                            } else {
                                c10 = c11;
                            }
                            j >>= 8;
                            i12++;
                            c11 = c10;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 != length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return p110k9.y.f19095a;
    }
}
