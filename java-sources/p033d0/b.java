package p033d0;

import java.util.Collection;
import java.util.List;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Collection f15528s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Collection collection) {
        super(1);
        this.f15527r = i10;
        this.f15528s = collection;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f15527r) {
            case 0:
                return Boolean.valueOf(this.f15528s.contains(obj));
            case 1:
                return Boolean.valueOf(this.f15528s.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f15528s));
        }
    }
}
