package W;

import Z.C0690k;
import Z.C0698o;
import androidx.compose.ui.semantics.AppendedSemanticsElement;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0576l f9194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f9195s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(C0576l c0576l, boolean z10) {
        super(2);
        this.f9194r = c0576l;
        this.f9195s = z10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            int i10 = A2.j.f22758b;
            for (int i11 = 0; i11 < i10; i11++) {
                int iC = A2.j.c(i11);
                boolean zE = c0698o.e(i11);
                Object objH = c0698o.H();
                if (zE || objH == C0690k.f10683a) {
                    objH = new F.v(i11, 3);
                    c0698o.e0(objH);
                }
                A2.m(new AppendedSemanticsElement((p241y9.c) objH, false), this.f9194r, iC, this.f9195s, c0698o, 0);
            }
        }
        return p110k9.y.f19095a;
    }
}
