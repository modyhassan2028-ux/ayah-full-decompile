package D4;

import P9.v;
import W.AbstractC0542b2;
import W.C0;
import W.G2;
import W.H2;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import com.ayah.R;
import com.google.android.gms.internal.measurement.B1;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1204r;

    public /* synthetic */ j(int i10) {
        this.f1204r = 21;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1204r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.playback_settings, c0698o), androidx.compose.foundation.layout.b.j(l0.o.f19333a, 8, 0.0f, 2), ((p005a4.a) c0698o.k(p005a4.e.f11187a)).k(), 0L, Y0.l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o.k(H2.f8580a)).g, c0698o, 196656, 0, 65496);
                } else {
                    c0698o.N();
                }
                return y.f19095a;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.select_verse, c0698o2), null, ((p005a4.a) c0698o2.k(p005a4.e.f11187a)).k(), 0L, Y0.l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).g, c0698o2, 196608, 0, 65498);
                } else {
                    c0698o2.N();
                }
                return y.f19095a;
            case 2:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0.a(F9.n.M(R.drawable.ic_back, c0698o3), p000a.a.m0(R.string.back, c0698o3), null, ((p005a4.a) c0698o3.k(p005a4.e.f11187a)).l(), c0698o3, 0, 4);
                } else {
                    c0698o3.N();
                }
                return y.f19095a;
            case 3:
                C0698o c0698o4 = (C0698o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c0698o4.K(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.library, c0698o4), null, ((p005a4.a) c0698o4.k(p005a4.e.f11187a)).k(), F9.n.B(18), Y0.l.f10361v, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o4.k(H2.f8580a)).f8569o, c0698o4, 199680, 0, 65490);
                } else {
                    c0698o4.N();
                }
                return y.f19095a;
            case 4:
                C0698o c0698o5 = (C0698o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c0698o5.K(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C0.b(B1.A(), p000a.a.m0(R.string.back, c0698o5), null, ((p005a4.a) c0698o5.k(p005a4.e.f11187a)).l(), c0698o5, 0, 4);
                } else {
                    c0698o5.N();
                }
                return y.f19095a;
            case 5:
                C0698o c0698o6 = (C0698o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!c0698o6.K(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c0698o6.N();
                }
                return y.f19095a;
            case 6:
                C0698o c0698o7 = (C0698o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c0698o7.K(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    C0.b(p000a.a.J(), p000a.a.m0(R.string.share, c0698o7), null, ((p005a4.a) c0698o7.k(p005a4.e.f11187a)).l(), c0698o7, 0, 4);
                } else {
                    c0698o7.N();
                }
                return y.f19095a;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 8:
                return ((p150o9.h) obj).L((p150o9.f) obj2);
            case 9:
                return ((p150o9.h) obj).L((p150o9.f) obj2);
            case 10:
                return Boolean.valueOf(p251z9.j.a(obj, obj2));
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                p251z9.j.e((M3.a) obj, "<unused var>");
                p251z9.j.e((String) obj2, "<unused var>");
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                p251z9.j.e((M3.a) obj, "<unused var>");
                p251z9.j.e((String) obj2, "<unused var>");
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p251z9.j.e((M3.a) obj, "<unused var>");
                p251z9.j.e((String) obj2, "<unused var>");
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                p150o9.f fVar = (p150o9.f) obj2;
                if (!(fVar instanceof v)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue8 = num != null ? num.intValue() : 1;
                return iIntValue8 == 0 ? fVar : Integer.valueOf(iIntValue8 + 1);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                v vVar = (v) obj;
                p150o9.f fVar2 = (p150o9.f) obj2;
                if (vVar != null) {
                    return vVar;
                }
                if (fVar2 instanceof v) {
                    return (v) fVar2;
                }
                return null;
            case 17:
                P9.y yVar = (P9.y) obj;
                p150o9.f fVar3 = (p150o9.f) obj2;
                if (fVar3 instanceof v) {
                    v vVar2 = (v) fVar3;
                    Object objC = vVar2.c(yVar.f6813a);
                    Object[] objArr = yVar.f6814b;
                    int i10 = yVar.f6816d;
                    objArr[i10] = objC;
                    v[] vVarArr = yVar.f6815c;
                    yVar.f6816d = i10 + 1;
                    vVarArr[i10] = vVar2;
                }
                return yVar;
            case 18:
                C0698o c0698o8 = (C0698o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c0698o8.K(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.reminders, c0698o8), null, B9.a.j(R.color.text, c0698o8), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o8, 0, 0, 131066);
                } else {
                    c0698o8.N();
                }
                return y.f19095a;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                C0698o c0698o9 = (C0698o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c0698o9.K(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    C0.a(F9.n.M(R.drawable.ic_back, c0698o9), null, null, B9.a.j(R.color.tint, c0698o9), c0698o9, 48, 4);
                } else {
                    c0698o9.N();
                }
                return y.f19095a;
            case 20:
                C0698o c0698o10 = (C0698o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c0698o10.K(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    Object objH = c0698o10.H();
                    if (objH == C0690k.f10683a) {
                        objH = new Ba.b(3);
                        c0698o10.e0(objH);
                    }
                    V4.a.b((p241y9.a) objH, null, c0698o10, 6);
                } else {
                    c0698o10.N();
                }
                return y.f19095a;
            case 21:
                ((Integer) obj2).getClass();
                B1.d(C0672b.y(1), (C0698o) obj);
                return y.f19095a;
            case 22:
                C0698o c0698o11 = (C0698o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c0698o11.K(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    C0.a(F9.n.M(R.drawable.ic_back, c0698o11), null, null, B9.a.j(R.color.tint, c0698o11), c0698o11, 48, 4);
                } else {
                    c0698o11.N();
                }
                return y.f19095a;
            case 23:
                C0698o c0698o12 = (C0698o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c0698o12.K(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.delete_khatmah, c0698o12), androidx.compose.foundation.layout.c.f11826a, ((p005a4.a) c0698o12.k(p005a4.e.f11187a)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o12, 48, 0, 131064);
                } else {
                    c0698o12.N();
                }
                return y.f19095a;
            case 24:
                C0698o c0698o13 = (C0698o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c0698o13.K(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.delete_khatmah_confirmation, c0698o13), androidx.compose.foundation.layout.c.f11826a, ((p005a4.a) c0698o13.k(p005a4.e.f11187a)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o13, 48, 0, 131064);
                } else {
                    c0698o13.N();
                }
                return y.f19095a;
            case 25:
                C0698o c0698o14 = (C0698o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (c0698o14.K(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.all_days, c0698o14), null, ((p005a4.a) c0698o14.k(p005a4.e.f11187a)).k(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o14, 0, 0, 131066);
                } else {
                    c0698o14.N();
                }
                return y.f19095a;
            case 26:
                C0698o c0698o15 = (C0698o) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (c0698o15.K(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    C0.a(F9.n.M(R.drawable.ic_back, c0698o15), null, null, B9.a.j(R.color.tint, c0698o15), c0698o15, 48, 4);
                } else {
                    c0698o15.N();
                }
                return y.f19095a;
            case 27:
                C0698o c0698o16 = (C0698o) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (c0698o16.K(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    C0.b(p000a.a.J(), p000a.a.m0(R.string.share, c0698o16), null, ((p005a4.a) c0698o16.k(p005a4.e.f11187a)).l(), c0698o16, 0, 4);
                } else {
                    c0698o16.N();
                }
                return y.f19095a;
            case 28:
                C0698o c0698o17 = (C0698o) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (c0698o17.K(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.share_text, c0698o17), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o17, 0, 0, 131070);
                } else {
                    c0698o17.N();
                }
                return y.f19095a;
            default:
                C0698o c0698o18 = (C0698o) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (c0698o18.K(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    AbstractC0542b2.b(p000a.a.m0(R.string.share_image, c0698o18), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o18, 0, 0, 131070);
                } else {
                    c0698o18.N();
                }
                return y.f19095a;
        }
    }

    public /* synthetic */ j(int i10, byte b5) {
        this.f1204r = i10;
    }
}
