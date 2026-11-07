package p055f1;

import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f15920s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i10) {
        super(0);
        this.f15919r = i10;
        this.f15920s = pVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f15919r) {
            case 0:
                return Float.valueOf(this.f15920s.c());
            default:
                return this.f15920s;
        }
    }
}
