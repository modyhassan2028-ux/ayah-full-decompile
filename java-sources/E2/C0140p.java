package E2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.RealmFieldTypeConstants;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: E2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0140p implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0140p f1748b = new C0140p(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1749a;

    public /* synthetic */ C0140p(int i10) {
        this.f1749a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1749a) {
            case 0:
                return ((C0142q) obj).f1750a - ((C0142q) obj2).f1750a;
            case 1:
                B b5 = (B) obj;
                B b10 = (B) obj2;
                RecyclerView recyclerView = b5.f1441d;
                if ((recyclerView == null) == (b10.f1441d == null)) {
                    boolean z10 = b5.f1438a;
                    if (z10 == b10.f1438a) {
                        int i10 = b10.f1439b - b5.f1439b;
                        if (i10 != 0) {
                            return i10;
                        }
                        int i11 = b5.f1440c - b10.f1440c;
                        if (i11 != 0) {
                            return i11;
                        }
                        return 0;
                    }
                    if (!z10) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 2:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 3:
                return p185s8.u0.i((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return p185s8.u0.i((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return p185s8.u0.i(((L2.f) obj).f5471a, ((L2.f) obj2).f5471a);
            case 6:
                return p185s8.u0.i(((L2.h) obj).f5482a, ((L2.h) obj2).f5482a);
            case 7:
                return p185s8.u0.i(Integer.valueOf(((p124m3.j) obj).f19585a), Integer.valueOf(((p124m3.j) obj2).f19585a));
            case 8:
                return ((Z2.f) obj).f10971a - ((Z2.f) obj2).f10971a;
            case 9:
                Z2.g gVar = (Z2.g) ((View) obj).getLayoutParams();
                Z2.g gVar2 = (Z2.g) ((View) obj2).getLayoutParams();
                boolean z11 = gVar.f10973a;
                if (z11 != gVar2.f10973a) {
                    return z11 ? 1 : -1;
                }
                return 0;
            case 10:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 11:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 12:
                if (obj == null) {
                    throw p123m2.c.p(obj2);
                }
                throw new ClassCastException();
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return ((p142o1.h) obj).f20247b - ((p142o1.h) obj2).f20247b;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                WeakHashMap weakHashMap = I1.S.f3689a;
                float fG = I1.I.g((View) obj);
                float fG2 = I1.I.g((View) obj2);
                if (fG > fG2) {
                    return -1;
                }
                return fG < fG2 ? 1 : 0;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return p185s8.u0.i(Long.valueOf(((p077h3.a) obj2).f16443d), Long.valueOf(((p077h3.a) obj).f16443d));
            default:
                return p185s8.u0.i(Integer.valueOf(((p210v5.b) obj).f23341a), Integer.valueOf(((p210v5.b) obj2).f23341a));
        }
    }
}
