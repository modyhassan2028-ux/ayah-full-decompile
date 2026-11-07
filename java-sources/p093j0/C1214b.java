package p093j0;

import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1214b extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f18626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f18627t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1214b(c cVar, c cVar2, int i10) {
        super(1);
        this.f18625r = i10;
        this.f18626s = cVar;
        this.f18627t = cVar2;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        long j;
        switch (this.f18625r) {
            case 0:
                m mVar = (m) obj;
                synchronized (n.f18661b) {
                    j = n.f18663d;
                    n.f18663d = 1 + j;
                }
                return new e(j, mVar, this.f18626s, this.f18627t);
            case 1:
                this.f18626s.e(obj);
                this.f18627t.e(obj);
                return y.f19095a;
            default:
                this.f18626s.e(obj);
                this.f18627t.e(obj);
                return y.f19095a;
        }
    }
}
