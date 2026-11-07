package R0;

import io.realm.RealmFieldTypeConstants;
import java.util.ArrayList;
import java.util.List;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final r f7126A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final r f7127B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final r f7128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final r f7129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final r f7130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final r f7131F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final r f7132G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final r f7133H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f7134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f7135t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f7136u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f7137v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f7138w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final r f7139x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final r f7140y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final r f7141z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7142r;

    static {
        int i10 = 2;
        f7134s = new r(i10, 0);
        f7135t = new r(i10, 1);
        f7136u = new r(i10, 2);
        f7137v = new r(i10, 3);
        f7138w = new r(i10, 4);
        f7139x = new r(i10, 5);
        f7140y = new r(i10, 6);
        f7141z = new r(i10, 7);
        f7126A = new r(i10, 8);
        f7127B = new r(i10, 9);
        f7128C = new r(i10, 10);
        f7129D = new r(i10, 11);
        f7130E = new r(i10, 12);
        f7131F = new r(i10, 13);
        f7132G = new r(i10, 14);
        f7133H = new r(i10, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f7142r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        p110k9.e eVar;
        switch (this.f7142r) {
            case 0:
                return (p122m0.e) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListD0 = p120l9.m.D0(list);
                arrayListD0.addAll(list2);
                return arrayListD0;
            case 2:
                return (p122m0.o) obj;
            case 3:
                return (y) obj;
            case 4:
                return (y) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (y) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                g gVar = (g) obj;
                int i10 = ((g) obj2).f7079a;
                return gVar;
            case 10:
                return (String) obj;
            case 11:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListD1 = p120l9.m.D0(list3);
                arrayListD1.addAll(list4);
                return arrayListD1;
            case 12:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f7068a) == null) {
                    str = aVar2.f7068a;
                }
                if (aVar == null || (eVar = aVar.f7069b) == null) {
                    eVar = aVar2.f7069b;
                }
                return new a(str, eVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
