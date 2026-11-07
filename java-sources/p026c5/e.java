package p026c5;

import java.util.List;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f13484s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, List list) {
        super(1);
        this.f13483r = i10;
        this.f13484s = list;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f13483r) {
            case 0:
                this.f13484s.get(((Number) obj).intValue());
                break;
            default:
                this.f13484s.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
