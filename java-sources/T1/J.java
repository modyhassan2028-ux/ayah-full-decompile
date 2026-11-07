package T1;

import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class J extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FileOutputStream f7604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FileOutputStream f7605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f7607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7608v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k7, q9.c cVar) {
        super(cVar);
        this.f7607u = k7;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7606t = obj;
        this.f7608v |= Integer.MIN_VALUE;
        return this.f7607u.b(null, this);
    }
}
