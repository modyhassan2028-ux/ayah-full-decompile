package p095j3;

import A6.a;
import E9.d;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.RealmFieldTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p120l9.n;
import p120l9.r;
import p120l9.v;
import p124m3.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    f18768t(R.string.by_meanings_60_days_subtitle, "BY_MEANINGS_60_DAYS"),
    f18769u(R.string.by_meanings_29_days_subtitle, "BY_MEANINGS_29_DAYS"),
    f18770v(R.string.by_meanings_7_days_subtitle, "BY_MEANINGS_7_DAYS"),
    f18771w(R.string.by_quarters_240_days_subtitle, "BY_QUARTERS_240_DAYS"),
    f18772x(R.string.by_quarters_120_days_subtitle, "BY_QUARTERS_120_DAYS"),
    f18773y(R.string.by_quarters_80_days_subtitle, "BY_QUARTERS_80_DAYS"),
    f18774z(R.string.by_quarters_60_days_subtitle, "BY_QUARTERS_60_DAYS"),
    f18760A(R.string.by_quarters_40_days_subtitle, "BY_QUARTERS_40_DAYS"),
    f18761B(R.string.by_quarters_30_days_subtitle, "BY_QUARTERS_30_DAYS"),
    f18762C(R.string.by_quarters_20_days_subtitle, "BY_QUARTERS_20_DAYS"),
    f18763D(R.string.by_quarters_15_days_subtitle, "BY_QUARTERS_15_DAYS"),
    f18764E(R.string.by_quarters_10_days_subtitle, "BY_QUARTERS_10_DAYS"),
    f18765F(R.string.by_quarters_6_days_subtitle, "BY_QUARTERS_6_DAYS"),
    f18766G(R.string.by_quarters_3_days_subtitle, "BY_QUARTERS_3_DAYS");


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18776s;

    c(int i10, String str) {
        this.f18775r = i;
        this.f18776s = i10;
    }

    public final List a(List list) {
        j.e(list, "quarters");
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            int iOrdinal2 = ordinal();
            if (iOrdinal2 == 0) {
                return AbstractC0813f2.L(new b(0, 0, 80), new b(1, 81, 147), new b(2, 148, 209), new b(3, 210, 259), new b(4, 260, 292), new b(5, 293, 366), new b(6, 367, 428), new b(7, 429, 492), new b(8, 493, 549), new b(9, 550, 605), new b(10, 606, 668), new b(11, 669, 718), new b(12, 719, 788), new b(13, 789, 882), new b(14, 883, 953), new b(15, 954, 1025), new b(16, 1026, 1094), new b(17, 1095, 1159), new b(18, 1160, 1234), new b(19, 1235, 1306), new b(20, 1307, 1363), new b(21, 1364, 1433), new b(22, 1434, 1521), new b(23, 1522, 1617), new b(24, 1618, 1706), new b(25, 1707, 1801), new b(26, 1802, 1942), new b(27, 1943, 2028), new b(28, 2029, 2139), new b(29, 2140, 2249), new b(30, 2250, 2347), new b(31, 2348, 2482), new b(32, 2483, 2594), new b(33, 2595, 2672), new b(34, 2673, 2790), new b(35, 2791, 2854), new b(36, 2855, 2931), new b(37, 2932, 3158), new b(38, 3159, 3251), new b(39, 3252, 3339), new b(40, 3340, 3408), new b(41, 3409, 3502), new b(42, 3503, 3580), new b(43, 3581, 3659), new b(44, 3660, 3787), new b(45, 3788, 4057), new b(46, 4058, 4132), new b(47, 4133, 4217), new b(48, 4218, 4324), new b(49, 4325, 4472), new b(50, 4473, 4582), new b(51, 4583, 4674), new b(52, 4675, 4900), new b(53, 4901, 5103), new b(54, 5104, 5176), new b(55, 5177, 5240), new b(56, 5241, 5446), new b(57, 5447, 5671), new b(58, 5672, 5947), new b(59, 5948, 6235));
            }
            if (iOrdinal2 != 1) {
                return iOrdinal2 != 2 ? r.f19440r : AbstractC0813f2.L(new b(0, 0, 668), new b(1, 669, 1363), new b(2, 1364, 2028), new b(3, 2029, 2931), new b(4, 2932, 3787), new b(5, 3788, 4629), new b(6, 4630, 6235));
            }
            return AbstractC0813f2.L(new b(0, 0, 147), new b(1, 148, 258), new b(2, 259, 384), new b(3, 385, 527), new b(4, 528, 668), new b(5, 669, 788), new b(6, 789, 953), new b(7, 954, 1159), new b(8, 1160, 1306), new b(9, 1307, 1472), new b(10, 1473, 1652), new b(11, 1653, 1801), new b(12, 1802, 2028), new b(13, 2029, 2249), new b(14, 2250, 2482), new b(15, 2483, 2672), new b(16, 2673, 2854), new b(17, 2855, 3158), new b(18, 3159, 3339), new b(19, 3340, 3532), new b(20, 3533, 3704), new b(21, 3705, 4057), new b(22, 4058, 4217), new b(23, 4218, 4472), new b(24, 4473, 4629), new b(25, 4630, 5103), new b(26, 5104, 5240), new b(27, 5241, 5671), new b(28, 5672, 6235));
        }
        int size = list.size() / b();
        d dVarI0 = B0.c.i0(0, b());
        ArrayList arrayList = new ArrayList(n.a0(dVarI0, 10));
        Iterator it = dVarI0.iterator();
        while (((E9.c) it).hasNext()) {
            int iNextInt = ((v) it).nextInt();
            arrayList.add(new b(iNextInt, ((h) list.get(iNextInt * size)).g.f19585a, ((h) list.get(((iNextInt + 1) * size) - 1)).f19581h.f19585a));
        }
        return arrayList;
    }

    public final int b() {
        switch (ordinal()) {
            case 0:
                return 60;
            case 1:
                return 29;
            case 2:
                return 7;
            case 3:
                return 240;
            case 4:
                return 120;
            case 5:
                return 80;
            case 6:
                return 60;
            case 7:
                return 40;
            case 8:
                return 30;
            case 9:
                return 20;
            case 10:
                return 15;
            case 11:
                return 10;
            case 12:
                return 6;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return 3;
            default:
                throw new a();
        }
    }
}
