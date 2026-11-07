package K0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0 f4879b = new C0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0 f4880c = new C0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0 f4881d = new C0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4882a;

    public /* synthetic */ C0(int i10) {
        this.f4882a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4882a) {
            case 0:
                p171r0.e eVarF = ((R0.p) obj).f();
                p171r0.e eVarF2 = ((R0.p) obj2).f();
                int iCompare = Float.compare(eVarF.f21389a, eVarF2.f21389a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(eVarF.f21390b, eVarF2.f21390b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(eVarF.f21392d, eVarF2.f21392d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(eVarF.f21391c, eVarF2.f21391c);
            case 1:
                p171r0.e eVarF3 = ((R0.p) obj).f();
                p171r0.e eVarF4 = ((R0.p) obj2).f();
                int iCompare4 = Float.compare(eVarF4.f21391c, eVarF3.f21391c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(eVarF3.f21390b, eVarF4.f21390b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(eVarF3.f21392d, eVarF4.f21392d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(eVarF4.f21389a, eVarF3.f21389a);
            default:
                p110k9.j jVar = (p110k9.j) obj;
                p110k9.j jVar2 = (p110k9.j) obj2;
                int iCompare7 = Float.compare(((p171r0.e) jVar.f19077r).f21390b, ((p171r0.e) jVar2.f19077r).f21390b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((p171r0.e) jVar.f19077r).f21392d, ((p171r0.e) jVar2.f19077r).f21392d);
        }
    }
}
