package K0;

import Z.C0698o;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final G f4928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final G f4929t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final G f4930u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final G f4931v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4932r;

    static {
        int i10 = 2;
        f4928s = new G(i10, 0);
        f4929t = new G(i10, 1);
        f4930u = new G(i10, 2);
        f4931v = new G(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i10, int i11) {
        super(i10);
        this.f4932r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4932r) {
            case 0:
                R0.p pVar = (R0.p) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                R0.j jVar = ((R0.p) obj).f7119d;
                R0.v vVar = R0.s.f7171r;
                Object objG = jVar.f7108r.g(vVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = pVar.f7119d.f7108r.g(vVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 1:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                }
                return p110k9.y.f19095a;
            case 2:
                ((InterfaceC0365q0) obj).K((Matrix) obj2);
                return p110k9.y.f19095a;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return p110k9.y.f19095a;
        }
    }
}
