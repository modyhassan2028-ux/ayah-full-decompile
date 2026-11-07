package G;

import java.util.Comparator;
import p185s8.u0;

/* JADX INFO: renamed from: G.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189x implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f2760b;

    public /* synthetic */ C0189x(a0 a0Var, int i10) {
        this.f2759a = i10;
        this.f2760b = a0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2759a) {
            case 0:
                Object obj3 = ((F.s) obj).f2117i;
                a0 a0Var = this.f2760b;
                return u0.i(Integer.valueOf(a0Var.f(obj3)), Integer.valueOf(a0Var.f(((F.s) obj2).f2117i)));
            case 1:
                Object obj4 = ((F.s) obj).f2117i;
                a0 a0Var2 = this.f2760b;
                return u0.i(Integer.valueOf(a0Var2.f(obj4)), Integer.valueOf(a0Var2.f(((F.s) obj2).f2117i)));
            case 2:
                Object obj5 = ((F.s) obj2).f2117i;
                a0 a0Var3 = this.f2760b;
                return u0.i(Integer.valueOf(a0Var3.f(obj5)), Integer.valueOf(a0Var3.f(((F.s) obj).f2117i)));
            default:
                Object obj6 = ((F.s) obj2).f2117i;
                a0 a0Var4 = this.f2760b;
                return u0.i(Integer.valueOf(a0Var4.f(obj6)), Integer.valueOf(a0Var4.f(((F.s) obj).f2117i)));
        }
    }
}
