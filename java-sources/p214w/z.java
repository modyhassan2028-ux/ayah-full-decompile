package p214w;

import A6.a;
import p223x.InterfaceC1435y;
import p223x.l0;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class z extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G f23560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H f23561t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(G g, H h7, int i10) {
        super(1);
        this.f23559r = i10;
        this.f23560s = g;
        this.f23561t = h7;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    @Override // p241y9.c
    public final Object e(Object obj) {
        InterfaceC1435y interfaceC1435y;
        InterfaceC1435y interfaceC1435y2;
        switch (this.f23559r) {
            case 0:
                l0 l0Var = (l0) obj;
                x xVar = x.f23549r;
                x xVar2 = x.f23550s;
                if (l0Var.b(xVar, xVar2)) {
                    I i10 = this.f23560s.f23440a.f23465a;
                    return (i10 == null || (interfaceC1435y2 = i10.f23444a) == null) ? B.f23416b : interfaceC1435y2;
                }
                if (!l0Var.b(xVar2, x.f23551t)) {
                    return B.f23416b;
                }
                I i11 = this.f23561t.f23443a.f23465a;
                return (i11 == null || (interfaceC1435y = i11.f23444a) == null) ? B.f23416b : interfaceC1435y;
            case 1:
                int iOrdinal = ((x) obj).ordinal();
                float f3 = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f3 = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            throw new a();
                        }
                        if (this.f23561t.f23443a.f23465a == null) {
                            f3 = 1.0f;
                        }
                    }
                } else if (this.f23560s.f23440a.f23465a == null) {
                    f3 = 1.0f;
                }
                return Float.valueOf(f3);
            case 2:
                l0 l0Var2 = (l0) obj;
                x xVar3 = x.f23549r;
                x xVar4 = x.f23550s;
                if (l0Var2.b(xVar3, xVar4)) {
                    return B.f23416b;
                }
                if (!l0Var2.b(xVar4, x.f23551t)) {
                    return B.f23416b;
                }
                T t2 = this.f23561t.f23443a;
                return B.f23416b;
            default:
                int iOrdinal2 = ((x) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new a();
                    }
                    T t10 = this.f23561t.f23443a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
