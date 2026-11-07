package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1149o0 extends AbstractC1168s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnumC1173t0 f18512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f18513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1149o0(EnumC1173t0 enumC1173t0, Predicate predicate) {
        super(enumC1173t0);
        this.f18512c = enumC1173t0;
        this.f18513d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f18540a) {
            return;
        }
        boolean zTest = this.f18513d.test(obj);
        EnumC1173t0 enumC1173t0 = this.f18512c;
        if (zTest == enumC1173t0.f18547a) {
            this.f18540a = true;
            this.f18541b = enumC1173t0.f18548b;
        }
    }
}
