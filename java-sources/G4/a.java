package G4;

import Z.X;
import java.io.IOException;
import p110k9.y;
import ra.EnumC1290b;
import ra.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2796u;

    public /* synthetic */ a(int i10, int i11, Object obj, Object obj2) {
        this.f2793r = i11;
        this.f2795t = obj;
        this.f2794s = i10;
        this.f2796u = obj2;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f2793r) {
            case 0:
                p241y9.c cVar = (p241y9.c) this.f2795t;
                X x9 = (X) this.f2796u;
                cVar.e(new E4.c(this.f2794s));
                x9.setValue(Boolean.TRUE);
                break;
            default:
                p pVar = (p) this.f2795t;
                try {
                    pVar.f21708N.A(this.f2794s, (EnumC1290b) this.f2796u);
                } catch (IOException e10) {
                    EnumC1290b enumC1290b = EnumC1290b.PROTOCOL_ERROR;
                    pVar.b(enumC1290b, enumC1290b, e10);
                }
                break;
        }
        return y.f19095a;
    }
}
