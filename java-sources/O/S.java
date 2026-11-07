package O;

import Z.X;
import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import p232y.c0;

/* JADX INFO: loaded from: classes.dex */
public final class S extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p063g1.c f6337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f6338t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(p063g1.c cVar, X x9, int i10) {
        super(1);
        this.f6336r = i10;
        this.f6337s = cVar;
        this.f6338t = x9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f6336r) {
            case 0:
                ((p063g1.h) obj).getClass();
                float fB = p063g1.h.b(0L);
                p063g1.c cVar = this.f6337s;
                this.f6338t.setValue(new p063g1.l((((long) cVar.E(fB)) << 32) | (((long) cVar.E(p063g1.h.a(0L))) & 4294967295L)));
                return p110k9.y.f19095a;
            default:
                A.E e10 = new A.E(1, (p241y9.a) obj);
                S s10 = new S(this.f6337s, this.f6338t, 0);
                if (p232y.S.a()) {
                    return p232y.S.a() ? new MagnifierElement(e10, s10, Build.VERSION.SDK_INT == 28 ? c0.f24480b : c0.f24481c) : l0.o.f19333a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
