package M;

import K.B;
import K.W;
import K.t0;
import U0.C0515g;
import U0.K;
import Z.C0681f0;
import Z0.C0710a;
import Z0.E;
import Z0.InterfaceC0716g;
import java.util.List;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5601r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f5602s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f5601r = i10;
        this.f5602s = gVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f5601r;
        boolean z10 = false;
        g gVar = this.f5602s;
        switch (i10) {
            case 0:
                C0681f0 c0681f0 = gVar.f5605J.f4570t;
                Boolean bool = Boolean.TRUE;
                c0681f0.setValue(bool);
                gVar.f5605J.f4569s.setValue(bool);
                g.y0(gVar, gVar.f5605J, ((C0515g) obj).f8060s, gVar.f5606K);
                return bool;
            case 1:
                List list = (List) obj;
                if (gVar.f5605J.d() != null) {
                    t0 t0VarD = gVar.f5605J.d();
                    p251z9.j.b(t0VarD);
                    list.add(t0VarD.f4794a);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                g.y0(gVar, gVar.f5605J, ((C0515g) obj).f8060s, gVar.f5606K);
                return Boolean.TRUE;
            default:
                C0515g c0515g = (C0515g) obj;
                if (!gVar.f5606K) {
                    return Boolean.FALSE;
                }
                E e10 = gVar.f5605J.f4557e;
                y yVar = null;
                if (e10 != null) {
                    List listS = p120l9.l.S(new InterfaceC0716g[]{new Z0.i(), new C0710a(c0515g, 1)});
                    W w9 = gVar.f5605J;
                    L5.c cVar = w9.f4556d;
                    B b5 = w9.f4572v;
                    Z0.y yVarL = cVar.l(listS);
                    e10.a(null, yVarL);
                    b5.e(yVarL);
                    yVar = y.f19095a;
                }
                if (yVar == null) {
                    Z0.y yVar2 = gVar.f5604I;
                    String str = yVar2.f10953a.f8060s;
                    long j = yVar2.f10954b;
                    int i11 = K.f8034c;
                    int i12 = (int) (j >> 32);
                    int i13 = (int) (j & 4294967295L);
                    p251z9.j.e(str, "<this>");
                    p251z9.j.e(c0515g, "replacement");
                    if (i13 < i12) {
                        throw new IndexOutOfBoundsException("End index (" + i13 + ") is less than start index (" + i12 + ").");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i12);
                    sb.append((CharSequence) c0515g);
                    sb.append((CharSequence) str, i13, str.length());
                    String string = sb.toString();
                    int length = c0515g.f8060s.length() + ((int) (gVar.f5604I.f10954b >> 32));
                    gVar.f5605J.f4572v.e(new Z0.y(va.g.e(length, length), 4, string));
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, R0.j jVar) {
        super(1);
        this.f5601r = 3;
        this.f5602s = gVar;
    }
}
