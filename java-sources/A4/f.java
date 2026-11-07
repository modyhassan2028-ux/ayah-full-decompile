package A4;

import D.C0077u;
import D.X;
import E4.u;
import F.C0153b;
import W.AbstractC0542b2;
import W.C0;
import W.H1;
import W.I1;
import X.s;
import Z.C0673b0;
import Z.C0690k;
import Z.C0698o;
import Z.M0;
import androidx.compose.foundation.layout.VerticalAlignElement;
import com.ayah.R;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import j$.time.LocalTime;
import l0.o;
import l0.r;
import p110k9.y;
import p180s0.F;
import p180s0.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f520s;

    public /* synthetic */ f(int i10, Object obj) {
        this.f519r = i10;
        this.f520s = obj;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long jL;
        int i10 = this.f519r;
        int i11 = 2;
        y yVar = y.f19095a;
        Object obj4 = this.f520s;
        switch (i10) {
            case 0:
                B4.c cVar = (B4.c) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue = ((Integer) obj3).intValue();
                int i12 = AudioConfigWrapper.f13759u;
                p251z9.j.e(cVar, "repeatType");
                C4.i audioConfigPresenter = ((AudioConfigWrapper) obj4).getAudioConfigPresenter();
                p144o3.b bVar = audioConfigPresenter.f755d;
                p165q3.b bVarA = audioConfigPresenter.f752a.a();
                if (bVarA != null) {
                    p165q3.a aVar = bVarA.g;
                    if (cVar == B4.c.f623s) {
                        bVar.a(new p165q3.a(aVar.f21279a, aVar.f21280b, zBooleanValue ? iIntValue : 1, aVar.f21282d));
                    } else if (cVar == B4.c.f622r) {
                        bVar.a(new p165q3.a(aVar.f21279a, aVar.f21280b, aVar.f21281c, zBooleanValue ? iIntValue : 1));
                    }
                }
                break;
            case 1:
                E4.a aVar2 = (E4.a) obj4;
                X x9 = (X) obj;
                C0698o c0698o = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                p251z9.j.e(x9, "$this$TitleImageRow");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0698o.g(x9) ? 4 : 2;
                }
                if (!c0698o.K(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    c0698o.N();
                } else {
                    if (aVar2.g) {
                        c0698o.T(1710112766);
                        jL = B9.a.j(R.color.note_tint, c0698o);
                        c0698o.p(false);
                    } else {
                        c0698o.T(1710180718);
                        jL = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).l();
                        c0698o.p(false);
                    }
                    C0.a(F9.n.M(2131230923, c0698o), p000a.a.m0(R.string.notes, c0698o), androidx.compose.foundation.layout.b.l(new VerticalAlignElement(), 0.0f, 0.0f, 16, 0.0f, 11), jL, c0698o, 0, 0);
                }
                break;
            case 2:
                Z.X x10 = (Z.X) obj4;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                p251z9.j.e((C0153b) obj, "$this$item");
                if (!c0698o2.K(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c0698o2.N();
                } else {
                    u uVar = (u) x10.getValue();
                    r rVarL = androidx.compose.foundation.layout.b.l(o.f19333a, 0.0f, 8, 0.0f, 16, 5);
                    Object objH = c0698o2.H();
                    if (objH == C0690k.f10683a) {
                        objH = new g(x10, i11);
                        c0698o2.e0(objH);
                    }
                    H4.a.a(uVar, rVarL, (p241y9.c) objH, c0698o2, 432);
                }
                break;
            case 3:
                ((E5.a) obj4).e((Throwable) obj);
                break;
            case 4:
                S9.c cVar2 = (S9.c) obj4;
                S9.c.f7533y.set(cVar2, null);
                cVar2.b(null);
                break;
            case 5:
                ((S9.g) obj4).d();
                break;
            case 6:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                LocalTime localTime = (LocalTime) obj3;
                p251z9.j.e((k3.h) obj, "<unused var>");
                p251z9.j.e(localTime, "time");
                ((p241y9.e) obj4).invoke(bool, localTime);
                break;
            case 7:
                p074h0.d dVar = (p074h0.d) obj4;
                C0698o c0698o3 = (C0698o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                p251z9.j.e((C0077u) obj, "$this$Card");
                if (!c0698o3.K(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c0698o3.N();
                } else {
                    dVar.invoke(c0698o3, 0);
                }
                break;
            case 8:
                H1 h7 = (H1) obj4;
                C0698o c0698o4 = (C0698o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                p251z9.j.e((X) obj, "$this$SwipeToDismissBox");
                if (!c0698o4.K(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    c0698o4.N();
                } else {
                    s sVar = h7.f8579b;
                    C0673b0 c0673b0 = sVar.f9782i;
                    C0673b0 c0673b1 = sVar.f9782i;
                    int iOrdinal = ((c0673b0.g() == 0.0f || Float.isNaN(c0673b1.g())) ? I1.f8597t : c0673b1.g() > 0.0f ? I1.f8595r : I1.f8596s).ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        c0698o4.T(1710464174);
                        AbstractC0542b2.b(p000a.a.m0(R.string.remove, c0698o4), androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.q(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f11828c, ((p005a4.a) c0698o4.k(p005a4.e.f11187a)).f(), F.f21774a), l0.c.f19318w), 12), q.f21840c, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o4, 384, 0, 131064);
                        c0698o4.p(false);
                    } else {
                        c0698o4.T(1710795378);
                        c0698o4.p(false);
                    }
                }
                break;
            default:
                String str = (String) obj4;
                C0698o c0698o5 = (C0698o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                p251z9.j.e((X) obj, "$this$TextButton");
                if (!c0698o5.K(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    c0698o5.N();
                } else {
                    M0 m10 = p005a4.e.f11187a;
                    AbstractC0542b2.b(str, null, ((p005a4.a) c0698o5.k(m10)).l(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o5, 0, 0, 131066);
                    C0.a(F9.n.M(2131230903, c0698o5), str, androidx.compose.foundation.layout.b.j(o.f19333a, 4, 0.0f, 2), ((p005a4.a) c0698o5.k(m10)).l(), c0698o5, 384, 0);
                }
                break;
        }
        return yVar;
    }

    public /* synthetic */ f(S9.c cVar, S9.b bVar) {
        this.f519r = 4;
        this.f520s = cVar;
    }
}
