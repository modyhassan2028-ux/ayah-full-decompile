package p178r8;

import i7.D;
import java.io.IOException;
import p213v8.b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final D f21614t = new D(11);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f21615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f21616s;

    public f(b bVar) {
        this.f21615r = bVar;
        this.f21616s = f21614t;
    }

    @Override // p178r8.k
    public void a(j jVar, int i10) throws IOException {
        int[] iArr = (int[]) this.f21616s;
        try {
            jVar.read((byte[]) this.f21615r, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            jVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f21615r = bArr;
        this.f21616s = iArr;
    }
}
