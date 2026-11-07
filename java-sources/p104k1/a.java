package p104k1;

import G.C0191z;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f18895s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(o oVar, int i10) {
        super(1);
        this.f18894r = i10;
        this.f18895s = oVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f18894r) {
            case 0:
                o oVar = this.f18895s;
                oVar.show();
                return new C0191z(6, oVar);
            default:
                o oVar2 = this.f18895s;
                if (oVar2.f18941v.f18935a) {
                    oVar2.f18940u.invoke();
                }
                return y.f19095a;
        }
    }
}
