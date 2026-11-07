package oa;

import i7.C1011q;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class i extends na.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f20416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1011q f20417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, s sVar, C1011q c1011q) {
        super(str);
        this.f20416e = sVar;
        this.f20417f = c1011q;
    }

    @Override // na.a
    public final long a() throws InterruptedException {
        r rVar;
        s sVar = this.f20416e;
        try {
            rVar = sVar.f();
        } catch (Throwable th) {
            rVar = new r(sVar, th, 2);
        }
        C1011q c1011q = this.f20417f;
        if (!((CopyOnWriteArrayList) c1011q.f17513f).contains(sVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c1011q.g).put(rVar);
        return -1L;
    }
}
