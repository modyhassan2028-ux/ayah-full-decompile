package p013b2;

import B9.a;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f13171f;
    public final /* synthetic */ ThreadPoolExecutor g;

    public m(a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f13171f = aVar;
        this.g = threadPoolExecutor;
    }

    @Override // B9.a
    public final void N(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.g;
        try {
            this.f13171f.N(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // B9.a
    public final void O(Aa.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.g;
        try {
            this.f13171f.O(aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
