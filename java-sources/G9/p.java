package G9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p241y9.c f2949c;

    public /* synthetic */ p(i iVar, p241y9.c cVar, int i10) {
        this.f2947a = i10;
        this.f2948b = iVar;
        this.f2949c = cVar;
    }

    @Override // G9.i
    public final Iterator iterator() {
        switch (this.f2947a) {
            case 0:
                return new f(this);
            default:
                return new q(this);
        }
    }
}
