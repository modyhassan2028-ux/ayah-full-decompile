package p085i0;

import java.util.Map;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f16715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f16716t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16717r;

    static {
        int i10 = 1;
        f16715s = new e(i10, 0);
        f16716t = new e(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f16717r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f16717r) {
            case 0:
                return new g((Map) obj);
            default:
                return obj;
        }
    }
}
