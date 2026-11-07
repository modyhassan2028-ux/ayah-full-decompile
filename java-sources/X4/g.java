package X4;

import Z.X;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f9971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f9972t;

    public /* synthetic */ g(X x9, p241y9.a aVar, int i10) {
        this.f9970r = i10;
        this.f9971s = x9;
        this.f9972t = aVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f9970r;
        y yVar = y.f19095a;
        p241y9.a aVar = this.f9972t;
        X x9 = this.f9971s;
        switch (i10) {
            case 0:
                x9.setValue(Boolean.FALSE);
                aVar.invoke();
                break;
            case 1:
                int i11 = KhatmahWrapper.f13794v;
                x9.setValue(Boolean.TRUE);
                aVar.invoke();
                break;
            default:
                int i12 = KhatmahWrapper.f13794v;
                x9.setValue(Boolean.FALSE);
                aVar.invoke();
                break;
        }
        return yVar;
    }
}
