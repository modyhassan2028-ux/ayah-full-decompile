package L6;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e implements G6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f5544b;

    public /* synthetic */ e(p101j9.a aVar, int i10) {
        this.f5543a = i10;
        this.f5544b = aVar;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f5543a) {
            case 0:
                String packageName = ((Context) this.f5544b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new k(Integer.valueOf(k.f5557u).intValue(), (Context) this.f5544b.get(), "com.google.android.datatransport.events");
        }
    }
}
