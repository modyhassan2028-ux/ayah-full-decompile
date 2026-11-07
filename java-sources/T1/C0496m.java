package T1;

import A.C0041r0;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: T1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0496m extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f7708s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0496m(B b5, int i10) {
        super(0);
        this.f7707r = i10;
        this.f7708s = b5;
    }

    @Override // p241y9.a
    public final Object invoke() throws IOException {
        switch (this.f7707r) {
            case 0:
                return ((I) this.f7708s.j.getValue()).f7600c;
            default:
                F f3 = this.f7708s.f7561a;
                File canonicalFile = ((File) f3.f7584c.invoke()).getCanonicalFile();
                synchronized (F.f7581e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = F.f7580d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    p251z9.j.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new I(canonicalFile, f3.f7582a, (M) f3.f7583b.e(canonicalFile), new C0041r0(23, canonicalFile));
        }
    }
}
