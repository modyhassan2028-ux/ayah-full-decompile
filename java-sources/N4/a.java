package N4;

import Z.C0672b;
import Z.C0698o;
import com.google.android.gms.internal.measurement.B1;
import p015b4.f;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6010s;

    public /* synthetic */ a(int i10, int i11, int i12) {
        this.f6009r = i12;
        this.f6010s = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6009r;
        C0698o c0698o = (C0698o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                B1.c(this.f6010s, C0672b.y(1), c0698o);
                break;
            default:
                f.j(this.f6010s, C0672b.y(1), c0698o);
                break;
        }
        return y.f19095a;
    }
}
