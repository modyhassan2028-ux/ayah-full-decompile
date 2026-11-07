package K0;

import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0703t;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r1 f5150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f5151t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(r1 r1Var, p241y9.e eVar, int i10) {
        super(2);
        this.f5149r = i10;
        this.f5150s = r1Var;
        this.f5151t = eVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5149r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f5150s.f5156r, this.f5151t, c0698o, 0);
                } else {
                    c0698o.N();
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r1 r1Var = this.f5150s;
                    AndroidComposeView androidComposeView = r1Var.f5156r;
                    Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
                    p150o9.c cVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof A9.a) && !(tag instanceof A9.d))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = androidComposeView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof A9.a) && !(tag2 instanceof A9.d))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        C0703t c0703t = c0698o2.Q;
                        if (c0703t == null) {
                            c0703t = new C0703t(c0698o2.g);
                            c0698o2.Q = c0703t;
                        }
                        set.add(c0703t);
                        c0698o2.f10735p = true;
                        c0698o2.f10707B = true;
                        c0698o2.f10724c.c();
                        c0698o2.f10712G.c();
                        Z.A0 a9 = c0698o2.f10713H;
                        Z.x0 x0Var = a9.f10560a;
                        a9.f10564e = x0Var.f10852A;
                        a9.f10565f = x0Var.f10853B;
                    }
                    boolean zI = c0698o2.i(r1Var);
                    Object objH = c0698o2.H();
                    Z.S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        objH = new p1(r1Var, cVar, 0);
                        c0698o2.e0(objH);
                    }
                    C0672b.f(c0698o2, androidComposeView, (p241y9.e) objH);
                    boolean zI2 = c0698o2.i(r1Var);
                    Object objH2 = c0698o2.H();
                    if (zI2 || objH2 == s10) {
                        objH2 = new p1(r1Var, cVar, 1);
                        c0698o2.e0(objH2);
                    }
                    C0672b.f(c0698o2, androidComposeView, (p241y9.e) objH2);
                    C0672b.a(p103k0.b.f18893a.a(set), p074h0.j.d(-1193460702, new q1(r1Var, this.f5151t, 0), c0698o2), c0698o2, 56);
                } else {
                    c0698o2.N();
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
