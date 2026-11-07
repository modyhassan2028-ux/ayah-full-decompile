package p093j0;

import java.util.Collection;
import java.util.List;
import p162q0.t;
import p241y9.c;
import p251z9.k;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class q extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18671r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18673t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i10, Collection collection) {
        super(1);
        this.f18672s = i10;
        this.f18673t = collection;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f18671r) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(this.f18672s, (Collection) this.f18673t));
            default:
                v vVar = (v) this.f18673t;
                boolean zZ0 = ((t) obj).z0(this.f18672s);
                vVar.f24886r = Boolean.valueOf(zZ0);
                return Boolean.valueOf(zZ0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, int i10) {
        super(1);
        this.f18673t = vVar;
        this.f18672s = i10;
    }
}
