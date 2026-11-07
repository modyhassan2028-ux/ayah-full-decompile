package H4;

import F.C0153b;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import Z.X;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ayah.R;
import java.text.NumberFormat;
import java.util.List;
import l0.o;
import p110k9.y;
import p214w.C1395h;
import p251z9.j;
import z3.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3361t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f3362u;

    public /* synthetic */ b(Object obj, Object obj2, p110k9.e eVar, int i10) {
        this.f3359r = i10;
        this.f3361t = obj;
        this.f3360s = obj2;
        this.f3362u = eVar;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        int i10 = this.f3359r;
        S s10 = C0690k.f10683a;
        o oVar = o.f19333a;
        y yVar = y.f19095a;
        p110k9.e eVar = this.f3362u;
        Object obj5 = this.f3360s;
        Object obj6 = this.f3361t;
        switch (i10) {
            case 0:
                p217w2.b bVar = (p217w2.b) obj6;
                NumberFormat numberFormat = (NumberFormat) obj5;
                d dVar = (d) eVar;
                int iIntValue = ((Integer) obj2).intValue();
                C0698o c0698o = (C0698o) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                j.e((C0153b) obj, "$this$items");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= c0698o.e(iIntValue) ? 32 : 16;
                }
                int i11 = iIntValue2;
                if (!c0698o.K(i11 & 1, (i11 & 145) != 144)) {
                    c0698o.N();
                } else {
                    p124m3.d dVar2 = (p124m3.d) bVar.b(iIntValue);
                    if (dVar2 != null) {
                        c0698o.T(-1155264676);
                        String str = numberFormat.format(Integer.valueOf(dVar2.f19550b));
                        j.d(str, "format(...)");
                        String strN0 = p000a.a.n0(R.string.page, new Object[]{str}, c0698o);
                        String strD = ((p124m3.j) dVar2.f19562p.getValue()).d((Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b));
                        boolean zG = c0698o.g(dVar) | c0698o.i(dVar2);
                        Object objH = c0698o.H();
                        if (zG || objH == s10) {
                            objH = new G4.f(3, dVar, dVar2);
                            c0698o.e0(objH);
                        }
                        p015b4.f.g(strN0, strD, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH, 7), c0698o, 0);
                    } else {
                        c0698o.T(-1156338361);
                    }
                    c0698o.p(false);
                }
                break;
            case 1:
                List list = (List) obj6;
                NumberFormat numberFormat2 = (NumberFormat) obj5;
                d dVar3 = (d) eVar;
                int iIntValue3 = ((Integer) obj2).intValue();
                C0698o c0698o2 = (C0698o) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                j.e((C0153b) obj, "$this$items");
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= c0698o2.e(iIntValue3) ? 32 : 16;
                }
                int i12 = iIntValue4;
                if (!c0698o2.K(i12 & 1, (i12 & 145) != 144)) {
                    c0698o2.N();
                } else {
                    l lVar = (l) list.get(iIntValue3);
                    String strB = lVar.f24799a.b();
                    String str2 = numberFormat2.format(Integer.valueOf(lVar.f24801c));
                    j.d(str2, "format(...)");
                    String strN1 = p000a.a.n0(R.string.page, new Object[]{str2}, c0698o2);
                    boolean zG2 = c0698o2.g(dVar3) | c0698o2.i(lVar);
                    Object objH2 = c0698o2.H();
                    if (zG2 || objH2 == s10) {
                        objH2 = new G4.f(5, dVar3, lVar);
                        c0698o2.e0(objH2);
                    }
                    p015b4.f.g(strB, strN1, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), c0698o2, 0);
                }
                break;
            default:
                p241y9.e eVar2 = (p241y9.e) obj5;
                p241y9.e eVar3 = (p241y9.e) eVar;
                p173r2.j jVar = (p173r2.j) obj2;
                C0698o c0698o3 = (C0698o) obj3;
                ((Integer) obj4).getClass();
                j.e((C1395h) obj, "$this$composable");
                j.e(jVar, "it");
                ((X) obj6).setValue(Integer.valueOf(R.string.start_khatmah_from));
                Bundle bundleA = jVar.f21448y.a();
                if (bundleA == null || (string = bundleA.getString("type")) == null) {
                    string = "BY_MEANINGS_29_DAYS";
                }
                Y4.a.c(p095j3.c.valueOf(string), eVar2, eVar3, null, c0698o3, 0);
                break;
        }
        return yVar;
    }
}
