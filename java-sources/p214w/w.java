package p214w;

import p223x.q0;
import p223x.s0;
import p241y9.c;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0 f23548s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(q0 q0Var, int i10) {
        super(1);
        this.f23547r = i10;
        this.f23548s = q0Var;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f23547r) {
            case 0:
                return Boolean.valueOf(!j.a(obj, this.f23548s.f24068d.getValue()));
            case 1:
                return new s0(this.f23548s, 0);
            default:
                return new s0(this.f23548s, 1);
        }
    }
}
