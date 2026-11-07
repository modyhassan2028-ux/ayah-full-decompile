package R6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f7262h;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7262h = bArr;
    }

    @Override // R6.m
    public final byte[] G0() {
        return this.f7262h;
    }
}
